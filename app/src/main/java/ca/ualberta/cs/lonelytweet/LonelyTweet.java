package ca.ualberta.cs.lonelytweet;

import java.io.IOException;
import java.io.Serializable;
import java.util.Date;

// 5. Deleted useless file template usage

abstract class LonelyTweet implements Serializable {
    private static final long serialVersionUID = 1L;
    // 1. Changed from protected to private
    private Date tweetDate;
    private String tweetBody;

    // 2. Changed from public to private
    private Date getTweetDate() {
        return tweetDate;
    }

    // 3. Remove unused setTweetDate

    public abstract String getTweetBody();

    // 4. Remove unused setTweetBody

    private void writeObject(java.io.ObjectOutputStream out) throws IOException {
        out.writeObject(tweetDate);
        out.writeObject(tweetBody);
    }

    private void readObject(java.io.ObjectInputStream in) throws IOException,
            ClassNotFoundException {
        tweetDate = (Date) in.readObject();
        tweetBody = (String) in.readObject();
    }

    public abstract boolean isValid();

    @Override
    public String toString() {
        return getTweetDate() + " | " + getTweetBody() ;
    }
}
