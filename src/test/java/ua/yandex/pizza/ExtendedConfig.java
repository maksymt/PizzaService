package ua.yandex.pizza;

import org.springframework.test.context.ContextConfiguration;

/**
 * @author Maksym Ternovoy (ternovoy@yandex-team.ru).
 */
@ContextConfiguration(locations = "classpath:/springConfig.xml", inheritLocations = true )
public class ExtendedConfig extends BaseConfig {
}
