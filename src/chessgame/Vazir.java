package chessgame;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import static chessgame.ChessGame.finder;
public class Vazir implements Mohre
{
    public void namayesh(int s[][] , Group root , int shomareMohre , int nobat)
    {
        int []m = new int[2];
        m = finder(400 + shomareMohre*10 + nobat , s);
        if(nobat==1)
        {
            Image vazir1 = new Image ("/Images/WhiteQueen.png");
            ImageView ax = new ImageView(vazir1);
            ax.setLayoutX(50 + 15.625 + 62.5*m[1]);
            ax.setLayoutY(50 + + 15.625 + 62.5*m[0]);
            ax.setFitWidth(31.25);
            ax.setFitHeight(31.25);
            root.getChildren().add(ax);
        }
        else
        {
            Image vazir2 = new Image ("/Images/BlackQueen.png");
            ImageView ax = new ImageView(vazir2);
            ax.setLayoutX(50 + 15.625 + 62.5*m[1]);
            ax.setLayoutY(50 + + 15.625 + 62.5*m[0]);
            ax.setFitWidth(31.25);
            ax.setFitHeight(31.25);
            root.getChildren().add(ax);
        }
    }
    public void gozine_harekat(int s[][] , int a , int b, int nobat , int g[][])
    {
        g[a][b] = -2;
        for(int i=b-1;i>=0;i--)
        {
            if(s[a][i]!=0 && s[a][i]%2 == nobat %2 )
            {
                break;
            }
            else if(s[a][i] != 0 && s[a][i]%2 != nobat%2)
            {
                g[a][i]=-1;
                break;
            }
            else
                g[a][i]= -1;
        }
        for(int i=b+1 ; i<8 ; i++)
        {
            if(s[a][i]!=0 && s[a][i]%2 ==nobat%2 )
            {
                break;
            }
            else if(s[a][i] != 0 && s[a][i]%2 !=nobat%2)
            {
                g[a][i]=-1;
                break;
            }
            else
                g[a][i]= -1;
        }
        for(int i=a-1 ; i>=0 ; i--)
        {
            if(s[i][b]!=0 && s[i][b]%2 ==nobat%2 )
            {
                break;
            }
            else if(s[i][b] != 0 && s[i][b]%2 !=nobat%2)
            {
                g[i][b]=-1;
                break;
            }
            else
                g[i][b]= -1;
        }
        for(int i=a+1 ; i<8 ; i++)
        {
            if(s[i][b]!=0 && s[i][b]%2 ==nobat%2 )
            {
                break;
            }
            else if(s[i][b] != 0 && s[i][b]%2 !=nobat%2)
            {
                g[i][b]=-1;
                break;
            }
            else
                g[i][b]= -1;
        }
        int i = a ; 
        int j = b ;
        g[a][b] = -2;
        while(i>=1 && j>=1 )
        {
            if(s[i-1][j-1]!=0 && s[i-1][j-1] %2 == nobat%2)
                break;
            else if( s[i-1][j-1] !=0 && s[i-1][j-1] %2 != nobat%2)
            {
                g[i-1][j-1]=-1;
                break;
            }
            else
                g[i-1][j-1]=-1;
            i--;
            j--;
        }
        i=a;
        j=b;
        while (i>=1 && j<=6)
        {
            if(s[i-1][j+1]!=0 && s[i-1][j+1] %2 == nobat%2)
                break;
            else if( s[i-1][j+1] !=0 && s[i-1][j+1] %2 != nobat%2)
            {
                g[i-1][j+1]=-1;
                break;
            }
            else
                g[i-1][j+1]=-1;
            i--;
            j++;
        }
        i=a;
        j=b;
        while ( i<=6 && j>=1 )
        {
            if(s[i+1][j-1]!=0 && s[i+1][j-1] %2 == nobat%2)
                break;
            else if( s[i+1][j-1] !=0 && s[i+1][j-1] %2 != nobat%2)
            {
                g[i+1][j-1]=-1;
                break;
            }
            else
                g[i+1][j-1]=-1;
            i++;
            j--;
        }
        i=a;
        j=b;
        while (i<=6 && j<=6)
        {
            if(s[i+1][j+1]!=0 && s[i+1][j+1] %2 == nobat%2)
                break;
            else if( s[i+1][j+1] !=0 && s[i+1][j+1] %2 != nobat%2)
            {
                g[i+1][j+1]=-1;
                break;
            }
            else
                g[i+1][j+1]=-1;
            i++;
            j++;
        }
    }
}
