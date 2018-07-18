package com.example.mohamedelwarraky.miwok;

public class Word {

    /**
     * Default translation for the word
     */
    private String mDefaultTranslation;

    /**
     * Miwok translation for the word
     */
    private String mMiwokTranslation;

    /**
     * Image resource ID for the word
     */
    private int mImageResourceId;

    /**
     * Audio resource ID for the word
     */
    private int mAudioResourceId;

    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation   is the word in the Miwok language
     *
     */
    public Word(String defaultTranslation, String miwokTranslation, int AudioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = AudioResourceId;
        mImageResourceId = NO_IMAGE_PROVIDED;

    }


    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation   is the word in the Miwok language
     *
     * @param ImageResouceId     is the image which desciribe the meaning of language
     *
     */
    public Word(String defaultTranslation, String miwokTranslation, int ImageResouceId, int AudioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = ImageResouceId;
        mAudioResourceId = AudioResourceId;
    }


    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }


    /**
     * Get the Miwok translation of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public int getAudioResourceId() {
        return mAudioResourceId;
    }



    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}

