
public class Video
{
    private static String DEFAULT_NAME = "NULL";
    private static String DEFAULT_CHANNEL = "NULL";
    private static String DEFAULT_DESCRIPTION = "NULL";
    private static double DEFAULT_LENGTH = 0.00;
    private static boolean DEFAULT_IS_PUBLIC = false;
    private static boolean DEFAULT_HAS_CLOSED_CAPTIONS = false;

    private String name, channel, description;
    private double length;
    private boolean isPublic, hasClosedCaptions;

    public Video()
    {
        this.setAll(DEFAULT_NAME, DEFAULT_CHANNEL, DEFAULT_DESCRIPTION, DEFAULT_LENGTH,
        DEFAULT_IS_PUBLIC, DEFAULT_HAS_CLOSED_CAPTIONS);
    }

    public Video(String name, String channel, String description, double length, boolean isPublic, boolean hasClosedCaptions)
    {
        this.setAll(name, channel, description, length, isPublic, hasClosedCaptions);
    }

    public Video(Video other)
    {
        this.setAll(other.name, other.channel, other.description, other.length, 
        other.isPublic, other.hasClosedCaptions);
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setChannel(String channel)
    {
        this.channel = channel;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public boolean setLength(double length)
    {
        if(length > 0)
        {
            this.length = length;
            return true;
        }
        else
        {
            return false;
        }
    }

    public void setIsPublic(boolean isPublic)
    {
        this.isPublic = isPublic;
    }

    public void setHasClosedCaptions(boolean hasClosedCaptions)
    {
        this.hasClosedCaptions = hasClosedCaptions;
    }

    public boolean setAll(String name, String channel, String description, double length, boolean isPublic, boolean hasClosedCaptions)
    {
        boolean isValid = this.setLength(length);
        
        if(isValid = true)
        {
        this.name = name;
        this.channel = channel;
        this.description = description;
        this.isPublic = isPublic;
        this.hasClosedCaptions = hasClosedCaptions;
        }
            return isValid;
    }

    public String toString()
    {
        String result = "";
        String answerYes = "Yes";
        String answerNo = "No";
        String answer;

        result += String.format("%10sYoutube Video%10s\n", " ", " ");
        result += String.format("Name: %-20s\n", this.name);
        result += String.format("Channel name: %-20s\n", this.channel);
        result += String.format("Description: %-50s\n", this.description);
        result += String.format("Video length: %4.2f\n", this.length);

        if (isPublic == true) {
            answer = answerYes;
        }
        if (isPublic == false) {
            answer = answerNo;
        } else {
            answer = "Yes";
        }

        result += String.format("Is it public?: %-3s\n", answer);

        if (hasClosedCaptions == true) {
            answer = answerYes;
        }
        if (hasClosedCaptions == false) {
            answer = answerNo;
        }

        result += String.format("Does it have captions?: %-3s\n", answer);
        result += "\n";

        return result;
    }
    
    public void equals(Video other)
    {

        if(this.name == other.name && this.channel == other.channel
            && this.description == other.description && this.length == other.length
            && this.isPublic == other.isPublic && this.hasClosedCaptions == other.hasClosedCaptions)
        {
            System.out.println("It's a match!!");
        }
        else
        {
            System.out.println("Not even the same");
        }
            
    }

}