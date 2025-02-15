package es.uah.matcomp.mp.e1.ejerciciosclases.apartadoc;

public class Point3D extends Point2D{
    private float z;
    public Point3D(float x, float y, float z){
        super(x,y);
        this.z = z;
    }
    public Point3D(){
        this.z = 0.0f;
    }
    public float getZ(){
        return z;
    }
    public void setZ(float z){
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        setX(x);
        setY(y);
        this.z = z;
    }
    public float[] getXYZ(){
        float[] result2 = new float[3];
        result2[0] = getX();
        result2[1] = getY();
        result2[2] = z;
        return result2;
    }
    @Override
    public String toString(){
        return "(" + getX() + "," + getY() + "," + z+ ")";
    }
}
