/*
Q2: Social Media Likes
Description: Write a method likePost() in a separate class SocialMedia that prints which user liked a post and the total new likes.

Parameters: Yes (String userName, int currentLikes)
Returns: None
Class Structure: Two classes (main in one class, mathod in a another)

Sample Output:
    Alice liked your post! Total likes: 11
 */
class SocialMediaLikes {
    public static void main(String[] args) {
        SocialMedia sm = new SocialMedia();
        sm.LikePost();
    }
}

class SocialMedia {
    void LikePost() {
        String userName = "Michael";
        int currentLikes =  3200;

        currentLikes++;

        System.out.println(userName+ " liked your post, your total likes are " +currentLikes+ ".");
    }    
}