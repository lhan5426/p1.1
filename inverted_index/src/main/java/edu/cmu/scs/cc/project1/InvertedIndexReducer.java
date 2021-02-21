package edu.cmu.scs.cc.project1;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class InvertedIndexReducer
        extends Reducer<Text, Text, Text, Text> {

    /**
     * The reduce function to run the inverted index job.
     *
     * TODO: Implement the reduce method.
     *
     * Output (word, inputFiles) key/value pair.
     *
     * inputFiles: (filename1,filename2,...)
     *
     * You may want to read the Javadoc of
     * {@link java.util.StringJoiner#StringJoiner(CharSequence, CharSequence, CharSequence)}
     * to construct strings with the required output format.
     *
     * the file names should be in ascending lexicographical order
     *
     * @param key     input key of reducer
     * @param values  input values of reduce which is iterable
     * @param context output key/value pair of reducer
     */
    @Override
    public void reduce(Text key, Iterable<Text> values, Context context) {

    }
}