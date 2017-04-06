package ro.isr.devschool.designpatterns.behavioral.chain;

import lombok.Getter;

/**
 * Created by scipianus on 06-Apr-17.
 */
public enum LogLevel {
    INFO(1),
    DEBUG(2),
    ERROR(3);

    @Getter
    private int level;

    LogLevel(int level) {
        this.level = level;
    }
}
