package top.ningg.spring.service;

/**
 * 为字符串,增加前缀和后缀.
 */
public interface IWrapService {


    /**
     * 为字符串增加前缀和后缀.
     *
     * @param word 输入的字符串.
     * @return 增加了前缀和后缀的字符串.
     */
    String wrap(String word);

}
