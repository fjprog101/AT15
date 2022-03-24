# Iteration 2: CLI + Data

The goal of this iteration is to implement a CLI (command line interface) that allows read/write Pokemon data and run trainer journey.
The name of the CLI interface is "pkm".

## User Story 1: Write Data As Admin
As a pkm admin, I want to be able to create data for the pokemon world based on requirements from iteration 1:

- Pokemon
- Trainer
- Battle
- Town

For example, the cli should allow to create a pokemon

```
pkm admin:create:pokemon -name "Pikachu" -hitpoints 100
```

Result of the running command above is a file created in [JSON](https://developer.mozilla.org/en-US/docs/Learn/JavaScript/Objects/JSON) format, which contains the data of the object created:

~/.pkm/pokemon/wei400sk2s.json
```
{
    id: "wei400sk2s",
    name: "Pikachu",
    hitpoints: {
        max: 100,
        current: 100,
    },
    moves: []
}
```

Trainer example:
```
pkm admin:create:trainer -name "Ash" -pokemon "wei400sk2s"
```
Result:

~/.pkm/trainer/saj34h9w8a.json
```
{
    id: "saj34h9w8a",
    name: "Ash",
    cash: 100,
    pokeballs: 5,
    party: [{
        id: "wei400sk2s",
        name: "Pikachu",
        hitpoints: {
            max: 100,
            current: 100,
        }
    }]
}
```

Notice that every time data is created, an ID, that can be for example a unique 10-digit alphanumeric string (nice to have: investigate object hashing), is generated and assigned to the JSON object that stores the data.
IDs can be used to link different type of objects (example: trainer/pokemon).

Also, the structure of the JSON object could vary depending on the design of how objects can store information.

## User Story 2: Read Data

Read data created by admin command. Example:

```
pkm query:pokemon -name "Pikachu"

> id: "wei400sk2s"
> name: "Pikachu"
> hitpoints: 100/100
```

## User Story 3: Behavior

Once data for pokemon has been created, the CLI should allow to run the behavior described in user stories for iteration 1. For running behavior, an object should be selected first
```
pkm pokemon:select -id "wei400sk2s"
```

Then, behavior of the object can be invoked, for example, pokemon learns a move
```
pkm pokemon:learn -name "tackle" -damage 20
```

Result, data updated:
pokemon/wei400sk2s.json
```
{
    id: "wei400sk2s",
    name: "Pikachu",
    town: "43jiie842s"
    hitpoints: {
        max: 100,
        current: 100,
    },
    moves: [{
        name: "tackle",
        damage: 20
    }]
}
```

Trainer example, fight pokemon (assuming wild pokemon with id "wqee424l2o" exists and its hit points is 21):
```
pkm trainer:select -id "saj34h9w8a"
pkm trainer:pokemon:select -id "wei400sk2s"
pkm trainer:pokemon:fight -id "wqee424l2o"
pkm trainer:pokemon:use "tackle"
pkm trainer:catch "wqee424l2o"

> Pokemon caught!
```

trainer/saj34h9w8a.json
```
{
    id: "saj34h9w8a",
    name: "Ash",
    cash: 100,
    pokeballs: 5,
    party: [{
        id: "wei400sk2s",
        name: "Pikachu",
        hitpoints: {
            max: 100,
            current: 100,
            fainted: false
        }
    },{
        id: "wqee424l2o",
        name: "Squirtle",
        hitpoints: {
            max: 21,
            current: 1
    }]
}
```

# Frameworks
CLI:
    - https://picocli.info/
JSON:
    - https://mvnrepository.com/artifact/com.googlecode.json-simple/json-simple/1.1.1
    - https://howtodoinjava.com/java/library/json-simple-read-write-json-examples/