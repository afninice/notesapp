package afniramadania.tech.notesapp.db;

import android.net.Uri;
import android.provider.BaseColumns;

public class DatabaseContract {

    public static final String AUTHORITY = "sfniramadania.tech.notesapp";
    private static final String SCHEME = "content";

    private DatabaseContract(){}


   public static final class NoteColumns implements BaseColumns {
       static String TABLE_NAME = "note";
        static String TITLE = "title";
        static String DESCRIPTION = "description";
        static String DATE = "date";

        public static final Uri CONTENT_URI = new Uri.Builder().scheme(SCHEME)
                .authority(AUTHORITY)
                .appendPath(TABLE_NAME)
                .build();
    }

}
