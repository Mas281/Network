package me.itsmas.network.server.command.annotations;

import me.itsmas.network.server.rank.Rank;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Target(METHOD)
public @interface RequiredRank
{
    /**
     * The rank needed to use the command
     */
    Rank value();
}
