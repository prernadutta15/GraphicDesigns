/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphicsassignment;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;

/**
 *
 * @author Prerna Dutta
 */
public class Wings {
    float[][] wing1=new float[4][3];
    float[][] wing2=new float[4][3];
    float[][] wing3=new float[4][3];
    public static Wings RotateWings(Wings r,Matrix m){
        float sum=0;
        Wings r1=new Wings();
        for(int k=0;k<4;k++)
            for(int i=0;i<3;i++){
                sum=0;
                for(int j=0;j<3;j++){
                sum+=r.wing1[k][j]*m.m_data[j][i];     
                }
                r1.wing1[k][i]=sum;
            }
        for(int k=0;k<4;k++)
            for(int i=0;i<3;i++){
                sum=0;
                for(int j=0;j<3;j++){
                sum+=r.wing2[k][j]*m.m_data[j][i];     
                }
                r1.wing2[k][i]=sum;
            }
        for(int k=0;k<4;k++)
            for(int i=0;i<3;i++){
                sum=0;
                for(int j=0;j<3;j++){
                sum+=r.wing3[k][j]*m.m_data[j][i];     
                }
                r1.wing3[k][i]=sum;
            }
        return(r1);
    }
    public void DrawRectangle(Graphics2D gfx){
       Polygon p1=new Polygon(); 
       p1.addPoint(Math.round(wing1[0][0]),Math.round(wing1[0][1]));
       p1.addPoint(Math.round(wing1[1][0]),Math.round(wing1[1][1]));
       p1.addPoint(Math.round(wing1[2][0]),Math.round(wing1[2][1]));
       p1.addPoint(Math.round(wing1[3][0]),Math.round(wing1[3][1]));
       Polygon p2=new Polygon(); 
       p2.addPoint(Math.round(wing2[0][0]),Math.round(wing2[0][1]));
       p2.addPoint(Math.round(wing2[1][0]),Math.round(wing2[1][1]));
       p2.addPoint(Math.round(wing2[2][0]),Math.round(wing2[2][1]));
       p2.addPoint(Math.round(wing2[3][0]),Math.round(wing2[3][1]));
       Polygon p3=new Polygon(); 
       p3.addPoint(Math.round(wing3[0][0]),Math.round(wing3[0][1]));
       p3.addPoint(Math.round(wing3[1][0]),Math.round(wing3[1][1]));
       p3.addPoint(Math.round(wing3[2][0]),Math.round(wing3[2][1]));
       p3.addPoint(Math.round(wing3[3][0]),Math.round(wing3[3][1]));
       gfx.setColor(Color.BLACK);
       gfx.drawPolygon(p1);
       gfx.drawPolygon(p2);
       gfx.drawPolygon(p3);
       try{
           Thread.sleep(25);
        }
        catch(Exception e){}
       gfx.setColor(gfx.getBackground());
       gfx.drawPolygon(p1);
       gfx.drawPolygon(p2);
       gfx.drawPolygon(p3);
       gfx.setColor(Color.BLACK);
    }
}
