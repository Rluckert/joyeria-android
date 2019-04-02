package com.example.my_jewelry;

public class Order {

    public static double CalculateTotal (int option1, int option2, int option3){
        double Total = 0;

        if (option1 == 0) {
            switch (option2){
                case 0:
                    Total += 50000;
                    break;
                case 1:
                    Total += 30000;
                    break;
                case 2:
                    Total += 90000;
                    break;
                case 3:
                    Total += 190000;
                    break;
                case 4:
                    Total += 180000;
                    break;
                case 5:
                    Total += 150000;
                    break;
            }

            switch (option3){
                case 0:
                    Total += 50000;
                    break;
                case 1:
                    Total += 30000;
                    break;
                case 2:
                    Total += 90000;
                    break;
                case 3:
                    Total += 190000;
                    break;
                case 4:
                    Total += 180000;
                    break;
                case 5:
                    Total += 150000;
                    break;
            }

        }else{
            switch (option2){
                case 0:
                    Total += 100000;
                    break;
                case 1:
                    Total += 50000;
                    break;
                case 2:
                    Total += 150000;
                    break;
                case 3:
                    Total += 190000;
                    break;
                case 4:
                    Total += 180000;
                    break;
                case 5:
                    Total += 150000;
                    break;
            }

            switch (option3){
                case 0:
                    Total += 100000;
                    break;
                case 1:
                    Total += 50000;
                    break;
                case 2:
                    Total += 150000;
                    break;
                case 3:
                    Total += 190000;
                    break;
                case 4:
                    Total += 180000;
                    break;
                case 5:
                    Total += 150000;
                    break;
            }

        }

        return Total;
    }
}
