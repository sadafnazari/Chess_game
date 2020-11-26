package chessgame;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import static chessgame.ChessGame.finder;
public class Shah implements Mohre
{
    public void namayesh(int s[][] , Group root , int shomareMohre , int nobat)
    {
        int []m = new int[2];
        m = finder(500 + shomareMohre*10 + nobat , s);
        if(nobat==1)
        {
            Image shah1 = new Image ("/Images/WhiteKing.png");
            ImageView ax = new ImageView(shah1);
            ax.setLayoutX(50 + 15.625 + 62.5*m[1]);
            ax.setLayoutY(50 + + 15.625 + 62.5*m[0]);
            ax.setFitWidth(31.25);
            ax.setFitHeight(31.25);
            root.getChildren().add(ax);
        }
        else
        {
            Image shah2 = new Image ("/Images/BlackKing.png");
            ImageView ax = new ImageView(shah2);
            ax.setLayoutX(50 + 15.625 + 62.5*m[1]);
            ax.setLayoutY(50 + + 15.625 + 62.5*m[0]);
            ax.setFitWidth(31.25);
            ax.setFitHeight(31.25);
            root.getChildren().add(ax);
        }
    }
    public void gozine_harekat(int s[][],int a , int b, int nobat , int g[][])
    {
        g[a][b] = -2;
        if(a>=1 && b>=1)
        {
            if(s[a-1][b-1]!=0 && s[a-1][b-1]%2 != nobat%2)
                g[a-1][b-1]=-1;
            else if(s[a-1][b-1] == 0 )
                g[a-1][b-1] = -1;
        }
        if(a>=1 )
        {
            if(s[a-1][b] !=0 && s[a-1][b]%2 != nobat%2)
                g[a-1][b] =-1;
            else if(s[a-1][b] == 0 )
                g[a-1][b]=-1;
        }
        if(a>=1 && b<=6)
        {
            if(s[a-1][b+1] !=0 && s[a-1][b+1]%2 != nobat%2)
                g[a-1][b+1] =-1;
            else if(s[a-1][b+1] == 0 )
                g[a-1][b+1]=-1;
        }
        if(b>=1)
        {
            if(s[a][b-1] !=0 && s[a][b-1]%2 != nobat%2)
                g[a][b-1] =-1;
            else if(s[a][b-1] == 0 )
                g[a][b-1]=-1;
        }
        if(b<=6)
        {
            if(s[a][b+1] !=0 && s[a][b+1]%2 != nobat%2)
                g[a][b+1] =-1;
            else if(s[a][b+1] == 0 )
                g[a][b+1]=-1;
        }
        if(a<=6 && b>=1)
        {
            if(s[a+1][b-1] !=0 && s[a+1][b-1]%2 != nobat%2)
                g[a+1][b-1] =-1;
            else if(s[a+1][b-1] == 0 )
                g[a+1][b-1]=-1;
        }
        if(a<=6)
        {
            if(s[a+1][b] !=0 && s[a+1][b]%2 != nobat%2)
                g[a+1][b] =-1;
            else if(s[a+1][b] == 0 )
                g[a+1][b]=-1;
        }
        if(a<=6 && b<=6)
        {
            if(s[a+1][b+1] !=0 && s[a+1][b+1]%2 != nobat%2)
                g[a+1][b+1] =-1;
            else if(s[a+1][b+1] == 0 )
                g[a+1][b+1]=-1;
        }
    }
}

