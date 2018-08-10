package top.ningg.spring.service.impl;

import top.ningg.spring.service.IWrapService;


public class WrapServiceImpl implements IWrapService {

    private String prefix;
    private String suffix;

    public WrapServiceImpl(String prefix, String suffix) {
        this.prefix = prefix;
        this.suffix = suffix;
    }

    @Override
    public String wrap(String word) {
        return prefix + word + suffix;
    }


}
