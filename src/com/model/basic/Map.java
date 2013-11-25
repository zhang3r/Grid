package com.model.basic;

import java.util.List;

public class Map {
	Tile [][] map;
	List<Unit> player;
	List<Unit> enemy;
	List<Unit> friendly;
	
	public Map(int x, int y){
		map = new Tile[x][y];
		for(int i=0; i<x; i++){
			for(int j=0; j<y; j++){
				map[x][y]= new Tile();
			}
		}
	}

}
