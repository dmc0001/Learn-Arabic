package dmc66.com;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Arabic translation for that word.
 */

public class Word{

    /**
     * Constant value that represents no image was provided for this word
     */

    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Image resource ID for the word
     */

    private int mResourceImageId = NO_IMAGE_PROVIDED;

    /**
     * Default translation for the word
     */

    private String mDefaultTranslation;

    /**
     * Arabic translation for the word
     */

    private String mArabicTranslation;


    private int mResourceAudioId;

    /**
     * Create a new Word object.
     *
     * @param  mDefaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param  mArabicTranslation   is the word in the Arabic language
     *
     * @param mResourceAudioId is the resource ID for the audio file associated with this word
     */

    public Word( String mArabicTranslation, String mDefaultTranslation, int mResourceAudioId) {

            this.mArabicTranslation = mArabicTranslation;
            this.mDefaultTranslation = mDefaultTranslation;
            this.mResourceAudioId = mResourceAudioId;
        }

    /**
     * Create a new Word object.
     *
     * @param  mDefaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param  mArabicTranslation   is the word in the Arabic language
     *
     * @param mResourceAudioId is the resource ID for the audio file associated with this word
     *
     * @param mResourceImageId    is the drawable resource ID for the image associated with the word
     */

    public Word(int mResourceImageId, String mArabicTranslation, String mDefaultTranslation , int mResourceAudioId) {

        this.mArabicTranslation = mArabicTranslation;
        this.mDefaultTranslation = mDefaultTranslation;
        this.mResourceImageId = mResourceImageId;
        this.mResourceAudioId = mResourceAudioId;
    }

    /**
     * Get the default translation of the word.
     */

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Arabic translation of the word.
     */

    public String getArabicTranslation() {
        return mArabicTranslation;
    }

    /**
     * Return the image resource ID of the word.
     */

    public int getResourceImageId() {
        return mResourceImageId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */

    public boolean hasImage() {
        return mResourceImageId != NO_IMAGE_PROVIDED;
    }

    /**
     * Return the audio resource ID of the word.
     */

    public int getResourceAudioId() {
        return mResourceAudioId;
    }

    /**
     * Returns the string representation of the {@link Word} object.
     */
    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mArabicTranslation + '\'' +
                ", mAudioResourceId=" + mResourceAudioId +
                ", mImageResourceId=" + mResourceImageId +
                '}';
    }

}


