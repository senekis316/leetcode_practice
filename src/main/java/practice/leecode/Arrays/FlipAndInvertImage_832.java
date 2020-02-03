package practice.leecode.Arrays;

public class FlipAndInvertImage_832 {

    public int[][] flipAndInvertImage(int[][] images) {
        for(int[] image: images) {
            for (int i = 0, j = image.length - 1; i <= j; i++, j--) {
                int tmp = image[i] ^ 1;
                image[i] = image[j] ^ 1;
                image[j] = tmp;
            }
        }
        return images;
    }

//    public int[][] flipAndInvertImage(int[][] images) {
//        for(int[] image: images) {
//            for (int i = 0, j = image.length - 1; i < j; i++, j--) {
//                image[i] = image[i] ^ image[j];
//                image[j] = image[i] ^ image[j];
//                image[i] = image[i] ^ image[j];
//            }
//            for (int i = 0; i < image.length; i++) {
//                image[i] = image[i] == 0 ? 1 : 0;
//            }
//        }
//        return images;
//    }

}
