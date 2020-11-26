package chessgame;
import javafx.scene.Group;
import static chessgame.ChessGame.finder;
public class Bazikon
{
    Rokh rokh1 = new Rokh();
    Rokh rokh2 = new Rokh();
    Asb asb1 = new Asb();
    Asb asb2 = new Asb();
    Fil fil1 = new Fil();
    Fil fil2 = new Fil();
    Sarbaz sarbaz1 = new Sarbaz();
    Sarbaz sarbaz2 = new Sarbaz();
    Sarbaz sarbaz3 = new Sarbaz();
    Sarbaz sarbaz4 = new Sarbaz();
    Sarbaz sarbaz5 = new Sarbaz();
    Sarbaz sarbaz6 = new Sarbaz();
    Sarbaz sarbaz7 = new Sarbaz();
    Sarbaz sarbaz8 = new Sarbaz();
    Shah shah = new Shah();
    Vazir vazir = new Vazir();
    public Bazikon ()
    {
    }
    public void namayesh(int s[][] , Group root , int nobat)
    {
        rokh1.namayesh(s, root, 1, nobat);
        rokh2.namayesh(s, root, 2, nobat);
        asb1.namayesh(s, root, 1, nobat);
        asb2.namayesh(s, root, 2, nobat);
        fil1.namayesh(s, root, 1, nobat);
        fil2.namayesh(s, root, 2, nobat);
        shah.namayesh(s, root, 1 , nobat);
        vazir.namayesh(s, root, 1, nobat);
        sarbaz1.namayesh(s, root, 0, nobat);
        sarbaz2.namayesh(s, root, 1, nobat);
        sarbaz3.namayesh(s, root, 2, nobat);
        sarbaz4.namayesh(s, root, 3, nobat);
        sarbaz5.namayesh(s, root, 4, nobat);
        sarbaz6.namayesh(s, root, 5, nobat);
        sarbaz7.namayesh(s, root, 6, nobat);
        sarbaz8.namayesh(s, root, 7, nobat);
    }
    public void gozine_harekat_mohre(int mohre , int s[][] , int g[][] , int nobat)
    {
        int m[]= new int[2];
        if(nobat==1)
        {
            if(mohre == 111)
            {
                m=finder(111,s);
                rokh1.gozine_harekat(s, m[0] , m[1] ,1 , g);
            }
            else if(mohre==121)
            {
                m=finder(121,s);
                rokh2.gozine_harekat(s, m[0], m[1], 1, g);
            }
            else if ( mohre == 211 )
            {
                m= finder(211,s);
                asb1.gozine_harekat(s, m[0], m[1], 1, g);
            }
            else if( mohre ==221)
            {
                m= finder(221,s);
                asb2.gozine_harekat(s, m[0], m[1], 1, g);
            }
            else if( mohre ==311)
            {
                m= finder(311,s);
                fil1.gozine_harekat(s, m[0], m[1], 1, g);
            }
            else if( mohre ==321)
            {
                m= finder(321,s);
                fil2.gozine_harekat(s, m[0], m[1], 1, g);
            }
            else if (mohre ==601)
            {
                m=finder(601,s);
                sarbaz1.gozine_harekat(s, m[0], m[1], 1, g);
            }
            else if( mohre ==611)
            {
                m=finder(611,s);
                sarbaz2.gozine_harekat(s, m[0], m[1], 1, g);
            }
            else if( mohre ==621)
            {
                m=finder(621,s);
                sarbaz3.gozine_harekat(s, m[0], m[1], 1, g);
            }
            else if( mohre==631)
            {
                m=finder(631,s);
                sarbaz4.gozine_harekat(s, m[0], m[1], 1, g);
            }
            else if( mohre ==641)
            {
                m=finder(641,s);
                sarbaz5.gozine_harekat(s, m[0], m[1], 1, g);
            }
            else if(mohre==651)
            {
                m=finder(651,s);
                sarbaz6.gozine_harekat(s, m[0], m[1], 1, g);
            }
            else if(mohre==661)
            {
                m=finder(661,s);
                sarbaz7.gozine_harekat(s, m[0], m[1], 1, g);
            }
            else if(mohre==671)
            {
                m=finder(671,s);
                sarbaz8.gozine_harekat(s, m[0], m[1], 1, g);
            }
            else if(mohre==411)
            {
                m=finder(411,s);
                vazir.gozine_harekat(s, m[0], m[1], 1, g);
            }
            else if ( mohre ==511)
            {
                m=finder(511 ,s);
                shah.gozine_harekat(s, m[0], m[1], 1, g);
            }
        }
        else
        {
            if( mohre == 112)
            {
                m=finder(112,s);
                rokh1.gozine_harekat(s, m[0], m[1], 2, g);
            }
            else if( mohre == 122)
            {
                m=finder(122,s);
                rokh2.gozine_harekat(s, m[0], m[1], 2, g);
            }
            else if( mohre ==212)
            {
                m= finder(212,s);
                asb1.gozine_harekat(s, m[0], m[1], 2, g);
            }
            else if( mohre ==222)
            {
                m= finder(222,s);
                asb2.gozine_harekat(s, m[0], m[1], 2, g);
            }
            else if( mohre ==312)
            {
                m= finder(312,s);
                fil1.gozine_harekat(s, m[0], m[1], 2, g);
            }
            else if( mohre ==322)
            {
                m= finder(322,s);
                fil2.gozine_harekat(s, m[0], m[1], 2, g);
            }
            else if ( mohre ==602)
            {
                m=finder(602,s);
                sarbaz1.gozine_harekat(s, m[0], m[1], 2, g);
            }
            else if( mohre ==612)
            {
                m=finder(612,s);
                sarbaz2.gozine_harekat(s, m[0], m[1], 2, g);
            }
            else if( mohre ==622)
            {
                m=finder(622,s);
                sarbaz3.gozine_harekat(s, m[0], m[1], 2, g);
            }
            else if( mohre ==632)
            {
                m=finder(632,s);
                sarbaz4.gozine_harekat(s, m[0], m[1], 2, g);
            }
            else if( mohre ==642)
            {
                m=finder(642,s);
                sarbaz5.gozine_harekat(s, m[0], m[1], 2, g);
            }
            else if( mohre ==652)
            {
                m=finder(652,s);
                sarbaz6.gozine_harekat(s, m[0], m[1], 2, g);
            }
            else if( mohre ==662)
            {
                m=finder(662,s);
                sarbaz7.gozine_harekat(s, m[0], m[1], 2, g);
            }
            else if( mohre ==672)
            {
                m=finder(672,s);
                sarbaz8.gozine_harekat(s, m[0], m[1], 2, g);
            }
            else if( mohre ==412)
            {
                m=finder(412,s);
                vazir.gozine_harekat(s, m[0], m[1], 2, g);
            }
            else if( mohre ==512)
            {
                m=finder(512 , s);
                shah.gozine_harekat(s, m[0], m[1], 2, g);
            }
        }
    }
    public int harekat(int [][]g ,int [][]s , int a , int b)
    {
        int m[] = new int [2];
        if(g[a][b]==-1)
        {
            for(int i=0 ; i<8 ;i++)
            {
                for(int j=0 ; j<8 ; j++)
                {
                    if(g[i][j]==-2)
                    {
                        m[0]=i;
                        m[1]=j;
                        break;
                    }
                }
            }
            s[a][b]=s[m[0]][m[1]];
            s[m[0]][m[1]]=0;
            return 1;
        }
        return 0;
    }
    public int shaheKhodiKish(int [][]s , int g[][] , int a , int b , int nobat)
    {
        int shomarande = -1;
        if(s[a][b]%2 == nobat%2)
        {
            shomarande =0;
            int g1[][] = new int [8][8];
            
            for(int i=0 ; i<8;i++)
            {
                for(int j=0;j<8;j++)
                {
                    g1[i][j] = g[i][j];
                }
            }
            int s1[][] = new int [8][8];
            for(int i=0 ; i<8;i++)
            {
                for(int j=0;j<8;j++)
                {
                    s1[i][j] = s[i][j];
                }
            }
            if(s[a][b] == 510+nobat)
            {
                int nobat1;
                if(nobat == 1)
                    nobat1= 2;
                else
                    nobat1=2;
                for(int i=0 ; i<8; i++)
                {
                    for(int j=0 ; j<8 ; j++)
                    {
                        shah.gozine_harekat(s, a, b, nobat, g);
                        if(g[i][j] == -1)
                        {
                            g[a][b] = 0;
                            int t1=g[i][j];
                            g[i][j] = 1;
                            int t = s[i][j];
                            s[i][j] = s[a][b];
                            s[a][b] = 0;
                            if(this.kish(s, g, nobat1))
                            {
                                shomarande++;
                            }
                            g[a][b]=-2;
                            g[i][j]=t1;
                            s[i][j]=t;
                            s[a][b]=510+nobat;
                        }
                    }
                }
            }
            for(int i=0 ; i<8;i++)
            {
                for(int j=0;j<8;j++)
                {
                    s1[i][j] = s[i][j];
                }
            }
            for(int i=0 ; i<8;i++)
            {
                for(int j=0;j<8;j++)
                {
                    g1[i][j] = g[i][j];
                }
            }
            g1[a][b]=0;
            s1[a][b]=0;
            int m[] = new int [2];
            int n[] = new int [2];
            m = finder(510+nobat , s);
            int nobat1 ;
            if(nobat==1)
                nobat1 = 2;
            else
                nobat1 = 1;
            int r;
            r = 0;
            for(int i=0 ; i<8 ; i++)
            {
                for(int j=0 ; j<8 ; j++)
                {
                    if(s[i][j] == 110+nobat1)
                    {
                        r++;
                    }
                }
            }
            if(r==1)
            {
                gozine_harekat_mohre(110+nobat1, s1, g1, nobat1);
                if(g1[m[0]][m[1]]==-1)
                {
                    shomarande++;
                    n=finder(110+nobat1, s);
                    g[n[0]][n[1]] = -3;
                }
                for(int i=0 ; i<8;i++)
                {
                    for(int j=0;j<8;j++)
                    {
                        g1[i][j] = g[i][j];
                    }
                }
                g1[a][b]=0;
                s1[a][b]=0;
            }
            r = 0;
            for(int i=0 ; i<8 ; i++)
            {
                for(int j=0 ; j<8 ; j++)
                {
                    if(s[i][j] == 120+nobat1)
                    {
                        r++;
                    }
                }
            }
            if(r==1)
            {
                gozine_harekat_mohre(120+nobat1, s1, g1, nobat1);
                if(g1[m[0]][m[1]]==-1)
                {
                    shomarande++;
                    n=finder(120+nobat1, s);
                    g[n[0]][n[1]] = -3;
                }
                for(int i=0 ; i<8;i++)
                {
                    for(int j=0;j<8;j++)
                    {
                        g1[i][j] = g[i][j];
                    }
                }
                g1[a][b]=0;
                s1[a][b]=0;
            }
            r = 0;
            for(int i=0 ; i<8 ; i++)
            {
                for(int j=0 ; j<8 ; j++)
                {
                    if(s[i][j] == 210+nobat1)
                    {
                        r++;
                    }
                }
            }
            if(r==1)
            {
                gozine_harekat_mohre(210+nobat1, s1, g1, nobat1);
                if(g1[m[0]][m[1]]==-1)
                {
                    shomarande++;
                    n=finder(210+nobat1, s);
                    g[n[0]][n[1]] = -3;
                }
                for(int i=0 ; i<8;i++)
                {
                    for(int j=0;j<8;j++)
                    {
                        g1[i][j] = g[i][j];
                    }
                }
                g1[a][b]=0;
                s1[a][b]=0;
            }
            r = 0;
            for(int i=0 ; i<8 ; i++)
            {
                for(int j=0 ; j<8 ; j++)
                {
                    if(s[i][j] == 220+nobat1)
                    {
                        r++;
                    }
                }
            }
            if(r==1)
            {
                gozine_harekat_mohre(220+nobat1, s1, g1, nobat1);
                if(g1[m[0]][m[1]]==-1)
                {
                    shomarande++;
                    n=finder(220+nobat1, s);
                    g[n[0]][n[1]] = -3;
                }
                for(int i=0 ; i<8;i++)
                {
                    for(int j=0;j<8;j++)
                    {
                        g1[i][j] = g[i][j];
                    }
                }
                g1[a][b]=0;
                s1[a][b]=0;
            }
            r = 0;
            for(int i=0 ; i<8 ; i++)
            {
                for(int j=0 ; j<8 ; j++)
                {
                    if(s[i][j] == 310+nobat1)
                    {
                        r++;
                    }
                }
            }
            if(r==1)
            {
                gozine_harekat_mohre(310+nobat1, s1, g1, nobat1);
                if(g1[m[0]][m[1]]==-1)
                {
                    shomarande++;
                    n=finder(310+nobat1, s);
                    g[n[0]][n[1]] = -3;
                }
                for(int i=0 ; i<8;i++)
                {
                    for(int j=0;j<8;j++)
                    {
                        g1[i][j] = g[i][j];
                    }
                }
                g1[a][b]=0;
                s1[a][b]=0;
            }
            r = 0;
            for(int i=0 ; i<8 ; i++)
            {
                for(int j=0 ; j<8 ; j++)
                {
                    if(s[i][j] == 320+nobat1)
                    {
                        r++;
                    }
                }
            }
            if(r==1)
            {
                gozine_harekat_mohre(320+nobat1, s1, g1, nobat1);
                if(g1[m[0]][m[1]]==-1)
                {
                    shomarande++;
                    n=finder(320+nobat1, s);
                    g[n[0]][n[1]] = -3;
                }
                for(int i=0 ; i<8;i++)
                {
                    for(int j=0;j<8;j++)
                    {
                        g1[i][j] = g[i][j];
                    }
                }
                g1[a][b]=0;
                s1[a][b]=0;
            }
            r = 0;
            for(int i=0 ; i<8 ; i++)
            {
                for(int j=0 ; j<8 ; j++)
                {
                    if(s[i][j] == 410+nobat1)
                    {
                        r++;
                    }
                }
            }
            if(r==1)
            {
                gozine_harekat_mohre(410+nobat1, s1, g1, nobat1);
                if(g1[m[0]][m[1]]==-1)
                {
                    shomarande++;
                    n=finder(410+nobat1, s);
                    g[n[0]][n[1]] = -3;
                }
                for(int i=0 ; i<8;i++)
                {
                    for(int j=0;j<8;j++)
                    {
                        g1[i][j] = g[i][j];
                    }
                }
                g1[a][b]=0;
                s1[a][b]=0;
            }
            r = 0;
            for(int i=0 ; i<8 ; i++)
            {
                for(int j=0 ; j<8 ; j++)
                {
                    if(s[i][j] == 510+nobat1)
                    {
                        r++;
                    }
                }
            }
            if(r==1)
            {
                gozine_harekat_mohre(510+nobat1, s1, g1, nobat1);
                if(g1[m[0]][m[1]]==-1)
                {
                    shomarande++;
                    n=finder(510+nobat1, s);
                    g[n[0]][n[1]] = -3;
                }
                for(int i=0 ; i<8;i++)
                {
                    for(int j=0;j<8;j++)
                    {
                        g1[i][j] = g[i][j];
                    }
                }
                g1[a][b]=0;
                s1[a][b]=0;
            }
            r = 0;
            for(int i=0 ; i<8 ; i++)
            {
                for(int j=0 ; j<8 ; j++)
                {
                    if(s[i][j] == 600+nobat1)
                    {
                        r++;
                    }
                }
            }
            if(r==1)
            {
                gozine_harekat_mohre(600+nobat1, s1, g1, nobat1);
                if(g1[m[0]][m[1]]==-1)
                {
                    shomarande++;
                    n=finder(600+nobat1, s);
                    g[n[0]][n[1]] = -3;
                }
                for(int i=0 ; i<8;i++)
                {
                    for(int j=0;j<8;j++)
                    {
                        g1[i][j] = g[i][j];
                    }
                }
                g1[a][b]=0;
                s1[a][b]=0;
            }
            r = 0;
            for(int i=0 ; i<8 ; i++)
            {
                for(int j=0 ; j<8 ; j++)
                {
                    if(s[i][j] == 610+nobat1)
                    {
                        r++;
                    }
                }
            }
            if(r==1)
            {
                gozine_harekat_mohre(610+nobat1, s1, g1, nobat1);
                if(g1[m[0]][m[1]]==-1)
                {
                    shomarande++;
                    n=finder(610+nobat1, s);
                    g[n[0]][n[1]] = -3;
                }
                for(int i=0 ; i<8;i++)
                {
                    for(int j=0;j<8;j++)
                    {
                        g1[i][j] = g[i][j];
                    }
                }
                g1[a][b]=0;
                s1[a][b]=0;
            }
            r = 0;
            for(int i=0 ; i<8 ; i++)
            {
                for(int j=0 ; j<8 ; j++)
                {
                    if(s[i][j] == 620+nobat1)
                    {
                        r++;
                    }
                }
            }
            if(r==1)
            {
                gozine_harekat_mohre(620+nobat1, s1, g1, nobat1);
                if(g1[m[0]][m[1]]==-1)
                {
                    shomarande++;
                    n=finder(620+nobat1, s);
                    g[n[0]][n[1]] = -3;
                }
                for(int i=0 ; i<8;i++)
                {
                    for(int j=0;j<8;j++)
                    {
                        g1[i][j] = g[i][j];
                    }
                }
                g1[a][b]=0;
                s1[a][b]=0;
            }
            r = 0;
            for(int i=0 ; i<8 ; i++)
            {
                for(int j=0 ; j<8 ; j++)
                {
                    if(s[i][j] == 630+nobat1)
                    {
                        r++;
                    }
                }
            }
            if(r==1)
            {
                gozine_harekat_mohre(630+nobat1, s1, g1, nobat1);
                if(g1[m[0]][m[1]]==-1)
                {
                    shomarande++;
                    n=finder(630+nobat1, s);
                    g[n[0]][n[1]] = -3;
                }
                for(int i=0 ; i<8;i++)
                {
                    for(int j=0;j<8;j++)
                    {
                        g1[i][j] = g[i][j];
                    }
                }
                g1[a][b]=0;
                s1[a][b]=0;
            }
            r = 0;
            for(int i=0 ; i<8 ; i++)
            {
                for(int j=0 ; j<8 ; j++)
                {
                    if(s[i][j] == 640+nobat1)
                    {
                        r++;
                    }
                }
            }
            if(r==1)
            {
                gozine_harekat_mohre(640+nobat1, s1, g1, nobat1);
                if(g1[m[0]][m[1]]==-1)
                {
                    shomarande++;
                    n=finder(640+nobat1, s);
                    g[n[0]][n[1]] = -3;
                }
                for(int i=0 ; i<8;i++)
                {
                    for(int j=0;j<8;j++)
                    {
                        g1[i][j] = g[i][j];
                    }
                }
                g1[a][b]=0;
                s1[a][b]=0;
            }
            r = 0;
            for(int i=0 ; i<8 ; i++)
            {
                for(int j=0 ; j<8 ; j++)
                {
                    if(s[i][j] == 650+nobat1)
                    {
                        r++;
                    }
                }
            }
            if(r==1)
            {
                gozine_harekat_mohre(650+nobat1, s1, g1, nobat1);
                if(g1[m[0]][m[1]]==-1)
                {
                    shomarande++;
                    n=finder(650+nobat1, s);
                    g[n[0]][n[1]] = -3;
                }
                for(int i=0 ; i<8;i++)
                {
                    for(int j=0;j<8;j++)
                    {
                        g1[i][j] = g[i][j];
                    }
                }
                g1[a][b]=0;
                s1[a][b]=0;
            }
            r = 0;
            for(int i=0 ; i<8 ; i++)
            {
                for(int j=0 ; j<8 ; j++)
                {
                    if(s[i][j] == 660+nobat1)
                    {
                        r++;
                    }
                }
            }
            if(r==1)
            {
                gozine_harekat_mohre(660+nobat1, s1, g1, nobat1);
                if(g1[m[0]][m[1]]==-1)
                {
                    shomarande++;
                    n=finder(660+nobat1, s);
                    g[n[0]][n[1]] = -3;
                }
                for(int i=0 ; i<8;i++)
                {
                    for(int j=0;j<8;j++)
                    {
                        g1[i][j] = g[i][j];
                    }
                }
                g1[a][b]=0;
                s1[a][b]=0;
            }
            r = 0;
            for(int i=0 ; i<8 ; i++)
            {
                for(int j=0 ; j<8 ; j++)
                {
                    if(s[i][j] == 670+nobat1)
                    {
                        r++;
                    }
                }
            }
            if(r==1)
            {
                gozine_harekat_mohre(670+nobat1, s1, g1, nobat1);
                if(g1[m[0]][m[1]]==-1)
                {
                    shomarande++;
                    n=finder(670+nobat1, s);
                    g[n[0]][n[1]] = -3;
                }
                for(int i=0 ; i<8;i++)
                {
                    for(int j=0;j<8;j++)
                    {
                        g1[i][j] = g[i][j];
                    }
                }
                g1[a][b]=0;
                s1[a][b]=0;
            }
        }
        return shomarande;
    }
    public void gozine_harekat_mohre_jadid(int a , int b , int [][]s , int g[][] , int nobat )
    {
        int nobat1;
        if(nobat==1)
            nobat1=2;
        else
            nobat1=1;
        if(s[a][b] == 510+nobat)
        {
            shah.gozine_harekat(s, a, b, nobat, g);
            for(int i=0 ; i<8;i++)
            {
                for(int j=0;j<8;j++)
                {
                    if(g[i][j] == -1)
                    {
                        int t1=g[i][j];
                        g[i][j]=1;
                        g[a][b]=0;
                        int t = s[i][j];
                        s[i][j] = s[a][b];
                        s[a][b]=0;
                        if(this.kish(s, g, nobat1))
                        {
                            g[i][j]=0;
                        }
                        else
                        {
                            g[i][j]=t;
                        }
                        g[a][b]=-2;
                        s[a][b]=510+nobat;
                        s[i][j]=0;
                    }
                }
            }
        }
        else{
        int t1 =0;
        int t2=0;
        for(int i=0 ; i<8 ; i++)
        {
            for(int j=0 ; j<8 ; j++)
            {
                if(g[i][j] == -3)
                {
                    t1 = i;
                    t2= j;
                    break;
                }
            }
        }
        int g1[][] = new int [8][8];
        for(int i=0 ; i<8 ; i++)
        {
            for(int j=0 ; j<8 ; j++)
            {
                g1[i][j] = g[i][j];
            }
        }
        this.gozine_harekat_mohre(s[a][b], s, g, nobat );
        int m[] = new int[2];
        for(int i=0 ; i<8 ; i++)
        {
            for(int j=0 ; j<8 ; j++)
            {
                if(g[i][j] == -1)
                {
                    int t = s[i][j];
                    s[i][j]=s[a][b];
                    s[a][b]=0;
                    m = finder(510+nobat , s);
                    this.gozine_harekat_mohre(s[t1][t2], s, g1, nobat1);
                    if(g1[m[0]][m[1]]==-1)
                    {
                        g[i][j]=0;
                    }
                    for(int n=0 ; n<8 ; n++)
                    {
                        for(int l=0 ; l<8 ; l++)
                        {
                            g1[n][l] = g[n][l];
                        }
                    }
                    s[a][b] = s[i][j];
                    s[i][j]=t;
                }
            }
        }}
    }
    public boolean kish(int [][]s , int g[][] , int nobat)
    {
        int [][]g1 = new int [8][8];
        int m[] = new int [2];
        int nobat1;
        if(nobat==1)
            nobat1 = 2;
        else
            nobat1 = 1;
        for(int i=0 ; i<8 ; i++)
        {
            for(int j=0 ; j<8 ; j++)
            {
                for(int q=0 ; q<8 ; q++)
                {
                    for(int w=0 ; w<8 ; w++)
                    {
                        g1[q][w] = g[q][w];
                    }
                }
                if(s[i][j]%2 == nobat%2)
                {
                    this.gozine_harekat_mohre(s[i][j], s, g1, nobat);
                    m = finder(510+nobat1, s);
                    if(g1[m[0]][m[1]] == -1 )
                        return true;
                }
            }
        }
        return false;
    }
    public boolean mat(int s[][] , int g[][] , int nobat)
    {
        int g1[][] = new int [8][8];
        for(int i=0 ; i<8 ; i++)
        {
            for(int j=0 ; j<8 ;j++)
            {
                if(s[i][j]%2 == nobat%2)
                {
                    for(int q=0 ; q<8;q++)
                    {
                        for(int w=0 ; w<8 ; w++)
                        {
                            g1[q][w] = g[q][w];
                        }
                    }
                    this.gozine_harekat_mohre(s[i][j], s, g1, nobat);
                    for(int q=0 ; q<8 ;q++)
                    {
                        for(int w=0 ; w<8 ; w++)
                        {
                            if(g1[q][w] == -1 )
                            {
                                int t = s[i][j] ;
                                s[q][w] = s[i][j];
                                s[i][j] = 0;
                                if(!this.kish(s, g1, nobat))
                                {
                                    s[q][w] = 0;
                                    s[i][j] = t;
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
    public void raf_kish(int a , int b , int s[][] , int g[][] , int nobat)
    {
        this.gozine_harekat_mohre(s[a][b], s, g, nobat);
        int nobat1;
        if(nobat == 1)
            nobat1 = 2;
        else
            nobat1 =1;
        for(int i=0 ; i<8 ; i++)
        {
            for(int j=0 ; j<8 ; j++)
            {
                if(g[i][j] == -1)
                {
                    g[i][j] = 1;
                    g[a][b] = 0;
                    int t = s[i][j];
                    s[i][j] = s[a][b];
                    s[a][b] = 0;
                    if(this.kish(s, g, nobat1))
                    {
                        g[i][j] =0;
                    }
                    else
                    {
                        g[i][j] = -1;
                    }
                    g[a][b] = -2;
                    s[a][b] = s[i][j];
                    s[i][j] = t;
                }
            }
        }
    }
}
