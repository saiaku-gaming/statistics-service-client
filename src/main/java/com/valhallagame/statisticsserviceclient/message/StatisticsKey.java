package com.valhallagame.statisticsserviceclient.message;

public enum StatisticsKey {
	/*----------------- ENEMIES --------------------*/
	PLAYER_CHARACTER_KILLED,
	
	FREDRIC_KILLED,
	EINHARJER_KILLED,
	BERSERKER_KILLED,
	SCOUT_KILLED,
	MAGE_KILLED,
	CHIEFTAIN_KILLED,

	/*----------------- BOSSES --------------------*/
	GRYNMA_KILLED,

	/*------------ CHARACTER RELATED ---------------*/
	DEATHS,
	DAMAGE_DONE,
	DAMAGE_TAKEN, 
	
	/*------------ Dungeon RELATED ---------------*/
	TRAINING_GROUNDS_CLEAR_TIME //Should this be in its own enum?
}
