package map;

public class MapEditor {
	
	private int mapWidth;
	private int mapHeight;
	private int tileWidth;
	private int tileHeight;
	
	private int[][] matrizMap;
	
	public MapEditor(int tileWidth, int tileHeight, int mapWidth, int mapHeight) {
		this.mapWidth = mapWidth;
		this.mapHeight = mapHeight;
		this.tileWidth = tileWidth;
		this.tileHeight = tileHeight;
		
		this.matrizMap = createMatrizMap(tileWidth, tileHeight, mapWidth, mapHeight);
	}
	
	public int[][] createMatrizMap(int tileWidth, int tileHeight, int mapWidth, int mapHeight){
		int scaleX = mapWidth / tileWidth;
		int scaleY = mapHeight / tileHeight;
		
		return new int[scaleY][scaleX];
	}
	
	
}
