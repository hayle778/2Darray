package com.example.demo;

public class TwoD {

public static void main(String[]args) {

    int[][] soccerGoal= {{1,3,4}, {7,2,1}, {4,2,9}};

    soccerGoal[0][0]=1;
    soccerGoal[0][1]=3;
    soccerGoal[0][2]=4;
    soccerGoal[1][0]=7;
    soccerGoal[1][1]=2;
    soccerGoal[1][2]=1;
    soccerGoal[2][0]=4;
    soccerGoal[2][1]=2;
    soccerGoal[2][2]=9;


//    for( int i=0; i<=3; i++) {
//    System.out.println(soccerGoal[i][i]);
//    }


    //  System.out.println("" + soccerGoal [0][2]);

for( int i=0; i<=3; i++){
for(int j=0; j<=3; i++) {

 System.out.println( soccerGoal[i][j]);

}
}


}

}
