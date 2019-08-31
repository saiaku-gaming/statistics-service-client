package com.valhallagame.statisticsserviceclient.message;

public enum StatisticsKey {
	/*----------------- ENEMIES --------------------*/
	PLAYER_CHARACTER_KILLED,
	
	EINHARJER_KILLED,
	BERSERKER_KILLED,
	SCOUT_KILLED,
	MAGE_KILLED,
	LOOTER_KILLED,
	GUARD_KILLED,
	QUARTERMASTER_KILLED,
	CHIEFTAIN_KILLED,

	/*----------------- MISUNDERSTOOD ENEMIES --------------------*/
	FREDRIC_KILLED,

	/*----------------- BOSSES --------------------*/
	GRYNMA_KILLED,

	/*------------ CHARACTER RELATED ---------------*/
	DEATHS,
	DAMAGE_DONE,
	DAMAGE_TAKEN,
	
	/*------------ Dungeon RELATED ---------------*/
	TRAINING_GROUNDS_CLEAR_TIME, //Should this be in its own enum?

	/*------------ Missveden RELATED --------------*/
	MISSVEDEN_CLEAR_TIME,
	MISSVEDEN_CLEARED,

	/*------------ Fredstorp RELATED --------------*/
	FREDSTORP_CLEAR_TIME,
	FREDSTORP_CLEARED,

	/*------------ Hjuö RELATED --------------*/
	HJUO_CLEAR_TIME,
	HJUO_CLEARED,

	/*------------ Grynmas Lair RELATED --------------*/
	GRYNMAS_LAIR_CLEAR_TIME,
	GRYNMAS_LAIR_CLEARED
}
