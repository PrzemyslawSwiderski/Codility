public class PassingCars {

    public int solution(int[] A) {

        int eastCarsCount = 0;
        int carsCount = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                eastCarsCount++;
            } else {
                if (carsCount + eastCarsCount > 1_000_000_000) {
                    return -1;
                }
                carsCount += eastCarsCount;

            }
        }

        return carsCount;
    }
}
