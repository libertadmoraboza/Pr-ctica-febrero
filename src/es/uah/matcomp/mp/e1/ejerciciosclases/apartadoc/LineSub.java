package es.uah.matcomp.mp.e1.ejerciciosclases.apartadoc;

public class LineSub extends Point{
    private Point begin;
    private Point end;
    public LineSub(float beginX, float beginY, float endX, float endY){
        this.begin = new Point(beginX, beginY);
        this.end = new Point(endX, endY);
    }
    public LineSub(Point begin, Point end){
        this.begin = begin;
        this.end = end;
    }
    public Point getBegin(){
        return begin;
    }
    public void setBegin(Point begin){
        this.begin = begin;
    }
    public Point getEnd(){
        return end;
    }
    public void setEnd(Point end){
        this.end = end;
    }
    public float getBeginX(){
        return begin.getX();
    }
    public float getBeginY(){
        return begin.getY();
    }
    public float getEndX(){
        return end.getX();
    }
    public float getEndY(){
        return end.getY();
    }
    public void setBeginX(float x){
        begin.setX(x);
    }
    public void setBeginY(float y){
        begin.setY(y);
    }
    public void setEndX(float x){
        end.setX(x);
    }
    public void setEndY(float y){
        end.setY(y);
    }
    public void setBeginXY(float x, float y){
        begin.setXY(x,y);
    }
    public void setEndXY(float x, float y){
        end.setXY(x,y);
    }
    public double getLength(){
        float xDiff = getEndX() - getBeginX();
        float yDiff = getEndY()- getBeginY();
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }
    public double getGradient(){
        float xDiff = getEndX() - getBeginX();
        float yDiff = getEndY() - getBeginY();
        return Math.atan2(yDiff, xDiff);
    }
    @Override
    public String toString(){
        return "LineSub[begin=" + begin + ",end=" + end +"]";
    }
}
