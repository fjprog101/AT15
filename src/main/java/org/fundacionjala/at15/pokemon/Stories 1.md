# Iteration 1: The Basics

## User Story 1: Pokémon
A Pokémon has a name, [hit points](https://bulbapedia.bulbagarden.net/wiki/HP) and should be able to learn and use moves.
During a battle, a Pokémon uses a move to attack its enemy and reduce the HP of that enemy depending on the move's damage, the more damage the move deals, the more HP's it will consume of the Pokémon that receives the attack. Once a Pokémon's HP reachs 0, it faints. Different Pokémon can have different max HP.

If all Pokémon in the player's party faint, then the player blacks out. This causes the player to lose a sum of money and be sent to a Pokémon Center (or to the player's house at the start of the game), at which point all of the player's Pokémon will be healed automatically.

A Pokémon can only know between one and four moves at a time.

## User Story 2: Trainer
A Pokémon Trainer is a person who catches, trains, cares for, and battles with Pokémon. The majority of people within the known Pokémon world are Trainers.
A trainer has a name and starts his/her journey with an initial Pokémon in its party. A party or team is a group of up to six Pokémon that a Trainer carries with them.

Also, a trainer has initial cash of 100$ and 5 pokeballs. Cash can be spent in the Pokémon store to buy items. The cash can also be received by winning battles or selling items.

The trainer always has a current town where he/she is currently located, and this defines the access he/she has to a Pokémon center, store, gym and wild Pokémon to catch.

In order to increase its party, the trainers can travel through towns and catch Pokémon that live in that town. Every time that trainer tries to catch a pokemon,
he/she looks for a wild pokemon in the current town where he/she is located, and throws a pokeball to the pokemon. The pokemon is caught only if its HP is lower to the 20% of its max HP. In order to achieve this, the catching process typically involves a battle in which the wild Pokémon is at first weakened and/or affected with a status condition, at which point the Trainer throws a Poké Ball at said Pokémon in order to catch it. The pokemon is only caught if its HP is lower than 20% of its max HP, otherwise, pokemon is not caught and the pokeball thrown is lost.

To be able to catch pokemon, trainer needs to have pokeballs available in its inventory, otherwise, the trainer cannot catch a pokemon (but still, it can engage in battles with wild pokemon).

## User Story 3: Battle
A Pokémon battle, often known as a Pokémon fight, is a form of competition between Pokémon. In these battles, one or more of the Pokémon is typically owned and trained by a person, its Pokémon Trainer, in order to win. In some cases, battles can be also between a trainer and a wild pokemon, which can eventually faint or be caught.

When entering a Single Battle, the first Pokémon that has not fainted in the party list is the one that will be drawn first. When battle starts, each trainer can invoke a pokemon move at the time. The trainer who gets all its available pokemon in it party fainted, loses the battle. The winner gets 50$ cash and the loser loses 50$. Trainer cash cannot be negative, hence, if the money lost is higher that money available, the cash balance of the trainer is simply set to 0$.


## User Story 4: Town
A town is a map location where three type of things can be always be found:
- Pokémon center
- Pokémon store (mart)
- pokemon Gym
- Wild Pokémon

Pokémon center is the place where a trainer can heal fainted Pokémon by restoring HP to max.

Pokémon store is where Pokémon items are available for trainers to buy and sell. Initially, we only need to support two types of items: Pokeballs and Potions.
Pokeballs are used to catch and carry pokemon. Potion can be used to heal Pokémon's HP during a battle. Pokeballs cost 20$ each, Potion 40$ each.

Often specializing in a particular type, Gyms create an environment which allows Trainers to test both their skills and Pokémon against those of others. The most powerful Trainer in a given Gym is called the Gym Leader, who is revered by both the lower-ranking members of the Gym and local fans. When a candidate trainer wants to win a badge from a Gym, the Gym leader must be confronted and defeated by the candidate trainer, and this can happen only when all lower-ranking members of the Gym have been previouly beaten by the candidate trainer as well.

Wild Pokémon are the Pokémon that trainers look for in their current town when they want to catch new Pokémon for their party/team.