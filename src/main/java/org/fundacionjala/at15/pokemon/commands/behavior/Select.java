package org.fundacionjala.at15.pokemon.commands.behavior;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.Callable;

import org.fundacionjala.at15.pokemon.CurrentEntities;
import org.fundacionjala.at15.pokemon.Pokemon;
import org.fundacionjala.at15.pokemon.Trainer;
import org.fundacionjala.at15.pokemon.io.EntityType;
import org.fundacionjala.at15.pokemon.io.Query;
import org.fundacionjala.at15.pokemon.io.Reader;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "select", description = "Select any object")
public class Select implements Callable<Integer> {
    @Option(names = { "-id" }, description = "Entity ID")
    private String entityID;

    @Override
    public Integer call() {
        if (entityID == null) {
            entityID = selectObject(selectType());
        }
        CurrentEntities current = (CurrentEntities) Reader.read("crt-12345678");
        setCurrentEntity(current);
        current.write();

        System.out.println("You have selected: ");
        System.out.println(getEntitySelected());
        return 0;
    }

    private void setCurrentEntity(CurrentEntities current) {
        final int three = 3;

        String prefix = entityID.substring(0, three);

        switch (prefix) {
            case "pkm":
                current.setPokemon(entityID);
                break;

            case "trn":
                current.setTrainer(entityID);
                break;

            case "btt":
                current.setBattle(entityID);
                break;

            case "twn":
                current.setTown(entityID);

            default:
                break;
        }
    }

    private String getEntitySelected() {
        final int three = 3;
        Pokemon pokemon;
        Trainer trainer;
        String prefix = entityID.substring(0, three);
        String result = "";

        switch (prefix) {
            case "pkm":
                pokemon = (Pokemon) Reader.read(entityID);
                result = "Movements: " + pokemon.getMovementList().size() + "\n";
                break;

            case "trn":
                trainer = (Trainer) Reader.read(entityID);
                result = "Pokeballs: " + trainer.getPokeballs().size() + "\n";
                break;

            default:
                break;
        }

        return result;
    }
    private String selectObject(EntityType type) {
        ArrayList<String> list = Query.getMatches(type, ":");
        System.out.println("Choose an option from the following list:");
        for (int index = 0; index < list.size(); index++) {
            System.out.print((index + 1) + " -> " + list.get(index) + "\n");
        }
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        scanner.close();
        return list.get(option - 1);
    }

    private EntityType selectType() {
        boolean flag = true;
        System.out.println("Which kind of entity do you want to select?");
        System.out.println("1. Pokemon");
        System.out.println("2. Trainer");
        System.out.println("3. Battle");
        System.out.println("4. Town");
        Scanner scanner = new Scanner(System.in);
        while (flag) {
            String option = scanner.nextLine();
            switch (option) {
                case "1":
                    return EntityType.POKEMON;
                case "2":
                    return EntityType.TRAINER;
                case "3":
                    return EntityType.BATTLE;
                case "4":
                    return EntityType.TOWN;
                default:
                    System.out.println("Select a number from 1 to 4");
                    break;
            }
        }
        scanner.close();
        return null;
    }
}
