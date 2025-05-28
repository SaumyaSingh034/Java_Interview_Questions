package Codility;

public class RoomAllocation {
    public static void main(String[] args){
        int[] A = {1,1,2,2,2};
        int[] A1 = {2,2,2,2,2};
        countRooms(A);
        countRoomsBasedOnDemands(A1);

    }

    private static void countRoomsBasedOnDemands(int[] a) {
        int sRoom = 0;
        int twinRoom = 0;

        for(int p : a){
            if(p==1)
                sRoom++;
            else if (p == 2) {
                twinRoom++;
            }
        }
        int room = sRoom;
        room += twinRoom/2;
        if(twinRoom%2 !=0)
            room++;
        System.out.println(room);
    }

    private static void countRooms(int[] a) {
        int totalPeople = a.length;
        System.out.println(totalPeople);
       int singleRoom = 0;
       int twinSharing = 0;
       for(int person : a){
           if(person == 1)
               singleRoom++;
           if(person == 2)
               twinSharing++;
       }
       int room = singleRoom;
       room += twinSharing/2;
       if(twinSharing %2 !=0)
           room++;
       System.out.println(room);

    }
}
