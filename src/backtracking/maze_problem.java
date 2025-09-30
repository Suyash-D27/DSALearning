package backtracking;

import java.util.ArrayList;

public class maze_problem {
    public static void main(String[] args) {
//        System.out.println(count(3,3));

//        System.out.println(path("",3,3));

//        System.out.println(pathDiagonal("",3,3));

        boolean [][] maze ={
                {true,true,true},
                {true,false,true},
                {true,true,true}

        };

        pathWithobstical("",maze,0,0);
    }

    public static int count ( int r, int c){
        if(r==1||c==1){
            return 1;
        }

        int left = count(r-1,c);
        int right = count(r,c-1);

        return left+right;

    }

    public static ArrayList<String> path(String p, int r,int c){
        if (r==1&c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();


        if(r>0){
          list.addAll(path(p+"R",r-1,c));
        }

        if(c>1){
            list.addAll(path(p+"D",r,c-1));
        }

        return list;

    }

    public static ArrayList<String> pathDiagonal(String p, int r,int c){
        if (r==1&c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if(r>1&&c>1){
            list.addAll(pathDiagonal(p+"D",r-1,c-1));
        }

        if(r>1){
            list.addAll(pathDiagonal(p+"V",r-1,c));
        }

        if(c>1){
            list.addAll(pathDiagonal(p+"H",r,c-1));
        }

        return list;

    }

    public static void pathWithobstical (String p, boolean[][] maze, int r , int c){
        if(r== maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return ;
        }

        if (!maze[r][c]){
            return ;
        }



        if(r< maze.length-1){
            pathWithobstical(p+"V",maze,r+1,c);
        }

        if(c<maze[0].length-1){
            pathWithobstical(p+"H",maze,r,c+1);
        }




    }



}
