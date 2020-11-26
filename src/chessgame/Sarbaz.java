package chessgame;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import static chessgame.ChessGame.finder;
public class Sarbaz implements Mohre
{
    public void namayesh(int s[][] , Group root , int shomareMohre , int nobat)
    {
        int []m = new int[2];
        m = finder(600 + shomareMohre*10 + nobat , s);
        if(nobat==1)
        {
            Image sarbaz1 = new Image ("/Images/WhitePawn.png");
            ImageView ax = new ImageView(sarbaz1);
            ax.setLayoutX(50 + 15.625 + 62.5*m[1]);
            ax.setLayoutY(50 + + 15.625 + 62.5*m[0]);
            ax.setFitWidth(31.25);
            ax.setFitHeight(31.25);
            root.getChildren().add(ax);
        }
        else
        {
            Image sarbaz2 = new Image ("/Images/BlackPawn.png");
            ImageView ax = new ImageView(sarbaz2);
            ax.setLayoutX(50 + 15.625 + 62.5*m[1]);
            ax.setLayoutY(50 + + 15.625 + 62.5*m[0]);
            ax.setFitWidth(31.25);
            ax.setFitHeight(31.25);
            root.getChildren().add(ax);
        }
    }
    public void gozine_harekat(int s[][] , int a , int b , int nobat , int g[][])
    {
        g[a][b] = -2;
        
        if(nobat==1)
        {
            if(a==1)
            {
                if(s[a+1][b] ==0 )
                {
                    g[a+1][b] =-1;
                    if(s[a+2][b] ==0)
                        g[a+2][b] =-1;
                }
                if(b>=1 && s[a+1][b-1]%2 != nobat%2 && s[a+1][b-1] != 0 )
                    g[a+1][b-1] = -1;
                if(b<=6 && s[a+1][b+1] %2 != nobat%2 && s[a+1][b+1] != 0)
                    g[a+1][b+1] = -1;
            }
            else if( a<=6 )
            {
                if(s[a+1][b] ==0 )
                    g[a+1][b] =-1;
                if(b>=1 && s[a+1][b-1]%2 != nobat%2 && s[a+1][b-1] != 0 )
                    g[a+1][b-1] = -1;
                if(b<=6 && s[a+1][b+1] %2 != nobat%2 && s[a+1][b+1] != 0)
                    g[a+1][b+1] = -1;
            }
            if(a==7)
            {
                s[a][b] = 410 + nobat;
            }
        }
        ////////////////////////////////////////////////////////////////////////
        else
        {
            if(a==6)
            {
                if(s[a-1][b] ==0 )
                {
                    g[a-1][b] =-1;
                    if(s[a-2][b] == 0)
                        g[a-2][b] =-1;
                }
                if(b>=1 && s[a-1][b-1]%2 != nobat%2 && s[a-1][b-1] != 0 )
                    g[a-1][b-1] = -1;
                if(b<=6 && s[a-1][b+1] %2 != nobat%2 && s[a-1][b+1] != 0)
                    g[a-1][b+1] = -1;
            }
            else if( a>=1 )
            {
                if(s[a-1][b] ==0 )
                    g[a-1][b] =-1;
                if(b>=1 && s[a-1][b-1]%2 != nobat%2 && s[a-1][b-1] != 0 )
                    g[a-1][b-1] = -1;
                if(b<=6 && s[a-1][b+1] %2 != nobat%2 && s[a-1][b+1] != 0)
                    g[a-1][b+1] = -1;
            }
            if(a==0)
            {
                s[a][b] = 410 + nobat;
            }
        }
    }
}
