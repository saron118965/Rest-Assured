package com.cydeo.pojo;

import java.util.List;

public class Search {

     private List<Spartan> content;

     // Searach Class has relation with Spartan Class
    // It is called as HAS-A RelationShip

     private  int totalElement;


    public List<Spartan> getContent() {
        return content;
    }

    public void setContent(List<Spartan> content) {
        this.content = content;
    }

    public int getTotalElement() {
        return totalElement;
    }

    public void setTotalElement(int totalElement) {
        this.totalElement = totalElement;
    }

    @Override
    public String toString() {
        return "Search{" +
                "content=" + content +
                ", totalElement=" + totalElement +
                '}';
    }
}
