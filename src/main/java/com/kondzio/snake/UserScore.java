package com.kondzio.snake;


public class UserScore {
    private int score;
    private long startTimeMs;


    public UserScore(){
        this.score = 0;
        this.startTimeMs = System.currentTimeMillis();
    }
    public long playTime(){
        return (System.currentTimeMillis()- startTimeMs)/1000;
    }

    public int getScore(){
        return score;
    }

    public void increaseScore(){
       score += 1;
    }
    public void gameTime(){

    }
    public long getDificultyLevel(){
        if(score<5){
            return 500;
        }
        if(score>=5&&score<10){
            return 250;
        }
        return 120;

    }

}
