class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
    int answer[] = new int[n];

    for(int i=0;i<bookings.length;i++){ // loop runs 3 times since 
                                         //   bookings.length = 3
       int L = bookings[i][0]-1; // flight 1 ---> made index 0  L & R coming from idea of Query length
       int R = bookings[i][1]-1; // flight 2 ---> made index 1
       int seats = bookings[i][2]; // already index 2 

       answer[L] =  answer[L] + seats;  // add seats in flight1

       if((R+1)<n){
       answer[R+1] = answer[R+1] - seats;
       }
    }
       int[] Pf = new int[n];
         Pf[0] = answer[0];
       for(int i=1;i<n;i++){
         Pf[i] = Pf[i-1] + answer[i];
       }
       return Pf;
    
    }
}