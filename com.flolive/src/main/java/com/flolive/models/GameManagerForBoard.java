package com.flolive.models;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Scope("singelton")
@Component
public class GameManagerForBoard {

	private Map<Integer,GameManagerObject> map;
	
	public GameManagerForBoard() {
		map = new HashMap<Integer, GameManagerObject>();
	}

	public Map<Integer,GameManagerObject> getMap() {
		return map;
	}

	public void setMap(Map<Integer,GameManagerObject> map) {
		this.map = map;
	}
}
