/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphicsassignment;

/**
 *
 * @author Prerna Dutta
 */
public class Matrix {
    public float[][] m_data=new float[3][3];
    int[] m1X3=new int[3];
    public static Matrix multimatrix(Matrix m1,Matrix m2){
        float sum;
        Matrix m=new Matrix();
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++){
                sum=0;
                for(int k=0;k<3;k++){
                    sum+=m1.m_data[i][k]*m2.m_data[k][j];
                }
                m.m_data[i][j]=sum;
            }
        return m;
    }
    public static float[][] Point2Matrix(float[][] p,Matrix m1){
       float sum=0;
       float[][] res=new float[4][3];
       for(int k=0;k<4;k++)
            for(int i=0;i<3;i++){
                     sum=0;
                     for(int j=0;j<3;j++){
                     sum+=p[k][j]*m1.m_data[j][i];     
                     }
                     res[k][i]=sum;
                 }
       return(res);
    }
    
}
