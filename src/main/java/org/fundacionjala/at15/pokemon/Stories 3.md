# Iteration 3: Pokemon League

As final iteration, we need to add support to existing functionality in order to improve the options we have to handle pokemon information

## User Story 1: Write/Read Data in XML
As pkm cli user, I want to pkm cli to also support read/write data in [XML](https://www.w3.org/standards/xml/core.html) format, so that I can have the option to work with XML and JSON formats for data stored in local drive.

Example
```
pkm admin create pokemon -name "Pikachu" -hitpoints 100 --csv
```

The "--csv" flag is used to specify that data should be written in csv format. If flag is not specified, JSON format is used by default.

To read data, pkm cli will always try to search any data available in both formats. Say, we have "Charizard" created as JSON, and "Bulbasaur" created as XML for the same trainer "Brock", and we want to list all pokemon whose trainer is "Brock", we have
```
pkm query:pokemon -trainer "Brock"
```

Result should show all pokemon owned by "Brock" trainer, regardless of the type of format they are saved with.
```
> id: "sdf44356sk2s"
> name: "Charizard"
> hitpoints: 100/100

> id: "sdf44356sk2s"
> name: "Bulbasaur"
> hitpoints: 70/90
```

## User Story 2: Exception handlers
Include Exception handling for the non ideal scenarios that are not currently supported by the project.

- Use commands without required subcommands. Example: pkm create pokemon
- Create objects (pokemon, trainer, battle) with missing required information. Example, create pokemon without hit points or trainer without name
- The object (pokemon, trainer, battle) couldn't be read or created due a read/write error
- A pokemon cannot learn a new movement due max limit of movements has been reached
- A pokemon cannot use a movement that it has not learned
- A trainer cannot use an item that he/she does not possess (example: pokeball, potion)
- A trainer cannot buy items if he/she cannot afford it (cash < price)
- A trainer cannot confront a Gym leader if he/she has not defeated all the lower ranking level trainers

Business logic code should throw the exception when the unexpected scenario happens. Commands code should handle the exception and show a message in console for each exception.

## User Story 3: Pokemon Types
Each pokemon can be classified with a certain type that makes it stronger, weaker or at the same level of power when entering in battle with another pokemon. There are multiple types, but for this requirement we will consider only 4:

- Normal, same level of power to any other type of pokemon
- Fire, weak against water pokemon attacks. Stronger against grass pokemon. Same level to normal and other fire pokemon
- Water, weak against grass pokemon attacks. Stronger against fire pokemon. Same level to normal and other water pokemon
- Grass, weak against fire pokemon attacks. Stronger against water pokemon. Same level to normal and other grass pokemon

The type adds potency to pokemon attack according to conditions above. Update code for pokemon attack to support conditions above.