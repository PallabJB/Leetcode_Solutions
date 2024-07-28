class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
      int [] count = new int[101];
      for(int i=0; i<seats.length;i++){
        count[seats[i]]++;
        count[students[i]]--;
      }
      int sum=0, moves=0;
      for(int i=0;i<101;i++){
        sum+=count[i];
        moves+=Math.abs(sum);
      }
      return moves;
    }
}
