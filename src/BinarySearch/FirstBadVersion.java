package BinarySearch;

public class FirstBadVersion {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        int firstBadVersion = n;
        while (left <= right) {
            int middle = (left +(right - left)) / 2;
            if (isBadVersion(middle)){
                right = middle;
            }
            else  { // is noy bad version
                left = middle + 1;
                firstBadVersion = left;
            }
        }

        /*            int middle =(left + right) / 2;
            if (isBadVersion(middle)) {
                right = middle - 1;
                firstBadVersion = middle;
            }
            else {
                left = middle + 1;
            }
        }
        return firstBadVersion;*/
        return firstBadVersion;
    }

    public boolean isBadVersion(int n) {
        return true;
    }
}
