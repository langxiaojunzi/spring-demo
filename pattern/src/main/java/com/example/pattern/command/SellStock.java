package com.example.pattern.command;

/**
 * <p>create at 2019/5/15</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
}
