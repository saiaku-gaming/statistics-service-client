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
	
	/*------------ Fredstorp RELAED --------------*/
	FREDSTORP_CLEAR_TIME,
	FREDSTORP_CLEARED
}
