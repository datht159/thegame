package mrmathami.thegame;

import javafx.geometry.Insets;
import javafx.scene.effect.Glow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

public class LoadedImage {
	private static Image load(String path) {
		try{
			return new Image(LoadedImage.class.getResourceAsStream(path));
		}catch (Exception ex){
			System.out.println("could not load resources file:"+path);
		}
		return null;
	}
	public static final Image NORMAL_TOWER = load("/images/normalTower.png");
//	public static final Image MENU_BACKGROUND= load("/images/bg_menu.png");
	public static final Image MACHINE_GUN_TOWER = load("/images/machineGunTower.png");
	public static final Image SNIPER_TOWER = load("/images/sniperTower.png");
	static final Image $$$ = load("/images/point.png");
	public static final Image NORMAL_ENEMY = load("/images/normalEnemy.png");
	public static final Image SMALLER_ENEMY = load("/images/smallerEnemy.png");
	public static final Image TANKER_ENEMY = load("/images/tankerEnemy.png");
	public static final Image BOSS_ENEMY = load("/images/bossEnemy.png");
	static final Image WIN = load("/images/game_win.png");
	static final Image LOSE = load("/images/game_over.png");
	private static BackgroundImage loadBGI(String path) {
		return new BackgroundImage(load(path), BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
	}
	static final Background BACKGROUND = new Background(loadBGI("/images/bg.png"));
	static final Background MENU_BACKGROUND = new Background(loadBGI("/images/bg_menu.png"));
	public static final Image TARGET = load("/images/target.png");

//	public static final Image ROAD = load("/graphic/road.png");
	public static final Image ROAD_0 = load("/images/road/road0.png");
	public static final Image ROAD_2 = load("/images/road/road2.png");
	public static final Image ROAD_3 = load("/images/road/road3.png");
	public static final Image ROAD_4 = load("/images/road/road4.png");
	public static final Image ROAD_5 = load("/images/road/road5.png");
	public static final Image ROAD_6 = load("/images/road/road6.png");
	public static final Image ROAD_7 = load("/images/road/road7.png");
	public static final Image ROAD_8 = load("/images/road/road8.png");
	public static final Image ROAD_9 = load("/images/road/road9.png");
	public static final Image ROAD_A = load("/images/road/roadA.png");
	public static final Image ROAD_B = load("/images/road/roadB.png");
	public static final Image ROAD_C = load("/images/road/roadC.png");
	public static final Image ROAD_D = load("/images/road/roadD.png");

	static ImageView imageView(Image image, double width, double height, boolean effect) {
		ImageView imageView = new ImageView(image);
		imageView.setFitWidth(width);
		imageView.setFitHeight(height);
		if (effect){
			imageView.setOnMouseMoved(e -> {
				imageView.setFitWidth(width * 1.1);
				imageView.setEffect(new Glow(0.3));
			});
			imageView.setOnMouseExited(e -> {
				imageView.setFitWidth(width);
				imageView.setEffect(null);
			});
		}
		return imageView;
	}

	static final Background focusBackground = new Background( new BackgroundFill( Color.BLUE, CornerRadii.EMPTY, Insets.EMPTY ) );
	static final Background unFocusBackground = new Background( new BackgroundFill( Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY ) );
	public static final Image[] OBSTACLES = {
			load("/images/tree.png"),
			load("/images/tree_2.png"),
			load("/images/tree_3.png")
	};

	public static final Image[] MOUNTAINS = {
			load("/images/grass.png"),
			load("/images/grass_1.png"),
			load("/images/grass_2.png"),
			load("/images/grass_3.png")
	};

	static final Image AUDIO_ON = load("/images/audio_on.png");
	static final Image AUDIO_OFF = load("/images/audio_mute.png");
	static final Image PAUSE = load("/images/pause.png");
	static final Image CONTINUE = load("/images/continue.png");
	static final Image SELL = load("/images/money.png");
	static final Image MUSIC_ON = load("/images/music_on.png");
	static final Image MUSIC_OFF = load("/images/music_mute.png");
	static final Image RESTART = load("/images/restart.png");
	static final Image NEW_GAME = load("/images/newGame.png");
	static final Image GAME_TITLE = load("/images/gameTitle.png");
	public static Image[] EXPLOSIONS = {
			load("/images/effect_4.png"),
			load("/images/effect_3.png"),
			load("/images/effect_2.png"),
			load("/images/effect_1.png")
	};
}
