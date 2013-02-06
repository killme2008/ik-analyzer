/**
 * 
 */
package org.wltea.analyzer.solr;

import java.io.Reader;
import java.util.Map;

import org.apache.lucene.analysis.Tokenizer;
import org.apache.lucene.analysis.util.TokenizerFactory;
import org.wltea.analyzer.lucene.IKTokenizer;

import java.io.IOException;
import org.apache.lucene.analysis.util.ResourceLoader;
import org.apache.lucene.analysis.util.ResourceLoaderAware;


/**
 * 实现Solr1.4分词器接口 基于IKTokenizer的实现
 * 
 * @author 林良益、李良杰
 * 
 */
public class IKTokenizerFactory extends TokenizerFactory implements ResourceLoaderAware {

    private boolean isMaxWordLength;


    @Override
    public void init(Map<String, String> args) {
        super.init(args);
        assureMatchVersion();
    }


    @Override
    public Tokenizer create(Reader input) {
        IKTokenizer ikTokenizer = new IKTokenizer(input, isMaxWordLength);
        return ikTokenizer;
    }


    public void inform(ResourceLoader loader) throws IOException {
        isMaxWordLength = getBoolean("isMaxWordLength", true);
    }

}
