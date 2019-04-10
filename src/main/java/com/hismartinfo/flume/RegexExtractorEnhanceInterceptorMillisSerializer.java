package com.hismartinfo.flume;

import com.google.common.base.Preconditions;
import org.apache.commons.lang.StringUtils;
import org.apache.flume.Context;
import org.apache.flume.conf.ComponentConfiguration;
import org.apache.flume.interceptor.RegexExtractorInterceptorSerializer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class RegexExtractorEnhanceInterceptorMillisSerializer implements
        RegexExtractorInterceptorSerializer {

    private SimpleDateFormat formatter;

    @Override
    public void configure(Context context) {
        String pattern = context.getString("pattern");
        String locale = context.getString("locale");
        Preconditions.checkArgument(!StringUtils.isEmpty(pattern),
                "Must configure with a valid pattern");
        if (StringUtils.isBlank(locale)) {
            formatter = new SimpleDateFormat(pattern);
        } else {
            formatter = new SimpleDateFormat(pattern, new Locale(locale));
        }

    }

    @Override
    public String serialize(String value) {
        Date date;
        try {
            date = formatter.parse(value);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return Long.toString(date.getTime());
    }

    @Override
    public void configure(ComponentConfiguration conf) {
        // NO-OP...
    }
}
