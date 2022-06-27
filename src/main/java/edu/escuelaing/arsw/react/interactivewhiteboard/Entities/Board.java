package edu.escuelaing.arsw.react.interactivewhiteboard.Entities;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private List<User> userList = new ArrayList<User>();
    private List<Point> pointList = new ArrayList<Point>();
    public static final Board instance = new Board();

    public static Board getInstance(){
        return instance;
    }

    public void addUser(User user){
        userList.add(user);
    }

    public void addPoint(Point point){
        if(!pointList.contains(point)){
            pointList.add(point);
        }

    }

    public void restart(){
        pointList.clear();
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public List<Point> getPointList() {
        return pointList;
    }

    public void setPointList(List<Point> pointList) {
        this.pointList = pointList;
    }

    public Color getUserColor(String name){
        for(User user: userList){
            if(user.getName().equals(name)){
                return user.getColor();
            }
        }
        return new Color(0,0,0);
    }
}
