/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphicassign1;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;

/**
 *
 * @author Prerna Dutta
 */
public class Cube {
    public float[][] points=new float[10][4];
    Cube(){
    }
    Cube(float[] a,float[] b,float[] c,float[] d,float[] e,float[] f,float[] g,float[] h,float[] i,float[] j){
        points[0]=a;
        points[1]=b;
        points[2]=c;
        points[3]=d;
        points[4]=e;
        points[5]=f;
        points[6]=g;
        points[7]=h;
        points[8]=i;
        points[9]=j;
    }
    public static Cube rotateCubeX(float[][] points,int angle){
        float[][] a={{1,0,0,0},{0,(float)Math.cos(Math.toRadians(angle)),(float)Math.sin(Math.toRadians(angle)),0},{0,-(float)Math.sin(Math.toRadians(angle)),(float)Math.cos(Math.toRadians(angle)),0},{0,0,0,1}};
        Matrix m=new Matrix();
        m.m_data=a;
        Cube c=new Cube();
        c.points=Matrix.Point2Matrix(points,m);
        return(c);
    }
    public static Cube rotateCubeY(float[][] points,int angle){
        float[][] a={{(float)Math.cos(Math.toRadians(angle)),0,-(float)Math.sin(Math.toRadians(angle)),0},{0,1,0,0},{(float)Math.sin(Math.toRadians(angle)),0,(float)Math.cos(Math.toRadians(angle)),0},{0,0,0,1}};
        Matrix m=new Matrix();
        m.m_data=a;
        Cube c=new Cube();
        c.points=Matrix.Point2Matrix(points,m);
        return(c);
    }
    public static Cube ProjectZ(float[][] points){
        float[][] a={{1,0,0,0},{0,1,0,0},{0,0,0,0},{0,0,0,1}};
        Matrix m=new Matrix();
        m.m_data=a;
        Cube c=new Cube();
        c.points=Matrix.Point2Matrix(points,m);
        return(c);
    }
    public static Cube ScaleUp(float[][] points,int factor){
        float[][] a={{factor,0,0,0},{0,factor,0,0},{0,0,factor,0},{0,0,0,1}};
        Matrix m=new Matrix();
        m.m_data=a;
        Cube c=new Cube();
        c.points=Matrix.Point2Matrix(points,m);
        return(c);
    }
    public static Cube MirrorY(float[][] points){
        float[][] a={{1,0,0,0},{0,-1,0,0},{0,0,1,0},{0,0,0,1}};
        Matrix m=new Matrix();
        m.m_data=a;
        Cube c=new Cube();
        c.points=Matrix.Point2Matrix(points,m);
        return(c);
    }
    public static Cube translate(float[][] points,float x,float y){
        float[][] a={{1,0,0,0},{0,1,0,0},{0,0,1,0},{x,y,0,1}};
        Matrix m=new Matrix();
        m.m_data=a;
        Cube c=new Cube();
        c.points=Matrix.Point2Matrix(points,m);
        return(c);
    }
    public static Cube ProjectCube(float[][] points,Matrix m){
        Cube c=new Cube();
        c.points=Matrix.Point2Matrix(points,m);
        return(c);
    }
    public void clearCube(Graphics2D gfx){
        this.drawCube(gfx, Color.white);
    }
    public void drawCube(Graphics2D gfx,Color c){
       Polygon p1=new Polygon(); 
       p1.addPoint(Math.round(points[0][0]/points[0][3]),Math.round(points[0][1]/points[0][3]));
       p1.addPoint(Math.round(points[1][0]/points[1][3]),Math.round(points[1][1]/points[1][3]));
       p1.addPoint(Math.round(points[2][0]/points[2][3]),Math.round(points[2][1]/points[2][3]));
       p1.addPoint(Math.round(points[3][0]/points[3][3]),Math.round(points[3][1]/points[3][3]));
       p1.addPoint(Math.round(points[4][0]/points[4][3]),Math.round(points[4][1]/points[4][3]));
       Polygon p2=new Polygon(); 
       p2.addPoint(Math.round(points[5][0]/points[5][3]),Math.round(points[5][1]/points[5][3]));
       p2.addPoint(Math.round(points[6][0]/points[6][3]),Math.round(points[6][1]/points[6][3]));
       p2.addPoint(Math.round(points[7][0]/points[7][3]),Math.round(points[7][1]/points[7][3]));
       p2.addPoint(Math.round(points[8][0]/points[8][3]),Math.round(points[8][1]/points[8][3]));
       Polygon p3=new Polygon(); 
       p3.addPoint(Math.round(points[0][0]/points[0][3]),Math.round(points[0][1]/points[0][3]));
       p3.addPoint(Math.round(points[5][0]/points[5][3]),Math.round(points[5][1]/points[5][3]));
       p3.addPoint(Math.round(points[6][0]/points[6][3]),Math.round(points[6][1]/points[6][3]));
       p3.addPoint(Math.round(points[9][0]/points[9][3]),Math.round(points[9][1]/points[9][3]));
       p3.addPoint(Math.round(points[1][0]/points[1][3]),Math.round(points[1][1]/points[1][3]));
       Polygon p4=new Polygon(); 
       p4.addPoint(Math.round(points[6][0]/points[6][3]),Math.round(points[6][1]/points[6][3]));
       p4.addPoint(Math.round(points[7][0]/points[7][3]),Math.round(points[7][1]/points[7][3]));
       p4.addPoint(Math.round(points[3][0]/points[3][3]),Math.round(points[3][1]/points[3][3]));
       p4.addPoint(Math.round(points[2][0]/points[2][3]),Math.round(points[2][1]/points[2][3]));
       p4.addPoint(Math.round(points[9][0]/points[9][3]),Math.round(points[9][1]/points[9][3]));
       Polygon p5=new Polygon(); 
       p5.addPoint(Math.round(points[0][0]/points[0][3]),Math.round(points[0][1]/points[0][3]));
       p5.addPoint(Math.round(points[5][0]/points[5][3]),Math.round(points[5][1]/points[5][3]));
       p5.addPoint(Math.round(points[8][0]/points[8][3]),Math.round(points[8][1]/points[8][3]));
       p5.addPoint(Math.round(points[4][0]/points[4][3]),Math.round(points[4][1]/points[4][3]));
       gfx.setColor(c);
       gfx.drawPolygon(p1);
       gfx.drawPolygon(p2);
       gfx.drawPolygon(p3);
       gfx.drawPolygon(p4);
       gfx.drawPolygon(p5);
    }
}
