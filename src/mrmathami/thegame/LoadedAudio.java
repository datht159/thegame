package mrmathami.thegame;

import javafx.scene.media.AudioClip;

import java.io.File;

public class LoadedAudio {
    private static AudioClip load(String path, double volume, int count) {
        File file = new File(LoadedAudio.class.getResource(path).getFile());
        AudioClip audioClip = new AudioClip(file.toURI().toString());
        audioClip.setVolume(volume);
        audioClip.setCycleCount(count);
        return audioClip;
    }

    public static AudioClip sniper() {
        return load("/audio/shoot.wav", 0.03, 1);
    }

    public static AudioClip normal() {
        return load("/audio/dead.wav", 0.05, 1);
    }

    public static AudioClip machineGun() {
        return load("/audio/dead1.wav" , 0.04, 1);
    }

    public static AudioClip enemyDestroy() {
        return load("/audio/dead.mp3", 0.04, 1);
    }

    static AudioClip BACKGROUND_MUSIC = backgroundMusic();
    private static AudioClip backgroundMusic() {
        AudioClip audioClip = load("/audio/game_music.mp3", 0.03, AudioClip.INDEFINITE);
        audioClip.setPriority(1);
        return audioClip;
    }
    static AudioClip WIN = load("/audio/comeout.wav", 0.5, 1);
    static AudioClip LOSE = load("/audio/GameoverOne.wav", 0.5, 1);
}
