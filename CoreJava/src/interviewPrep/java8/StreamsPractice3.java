package interviewPrep.java8;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsPractice3 {
    public static void main(String[] args) {
        // Most important
        System.out.println("✅ \uD83D\uDD25 Most Important (Frequently Asked in Interviews)\n");
        //1.	Given a list of orders, find all orders with amount > 1000 and return a list of order IDs.
        List<Orders> ordersList =  new ArrayList<>(Arrays.asList(new Orders(1,20000,"Television"),new Orders(2,121,"Headphone"),new Orders(3,123232,"Sony camera")));
        List<Integer> priceK = ordersList.stream().filter(order->order.getAmount()>1000).map(Orders::getOrderId).toList();
        System.out.println("1.find all orders with amount > 1000 and return a list of order IDs."+priceK);
        // 2.   list of product names to uppercase, remove duplicates, and return them sorted.
        List<String> products = new ArrayList<>(Arrays.asList("television","iphone","motorola","nokia","iphone","speakers","speakers"));
        List<String> uniqueUpperProducts = products.stream().distinct().map(String::toUpperCase).sorted().toList();
        System.out.println("2.list of product names to uppercase, remove duplicates, and return them sorted."+uniqueUpperProducts);
        // 3.	Flatten a list of lists of product categories and return all unique category names.
        List<List<String>> categories = Arrays.asList(
                Arrays.asList("Electronics", "Home Appliances"),
                Arrays.asList("Books", "Electronics"),
                Arrays.asList("Toys", "Books")
        );
        List<String> uniqueCategories = categories.stream().flatMap(List::stream).distinct().toList();
        System.out.println("3. Flatten a list of lists of product categories and return all unique category names."+uniqueCategories);
        // 4.	Group customers by their city and return a Map<String, List<Customer>>.
        List<Consumer> consumerList = new ArrayList<>(Arrays.asList(new Consumer("Dinesh",25,"Tiruvannamalai"),new Consumer("Keerthana",23,"Hyderabad"),new Consumer("Akshay",24,"Warangal"),new Consumer("Saketh",27,"Warangal")));
        Map<String,List<Consumer>> groupedConsumer = consumerList.stream().collect(Collectors.groupingBy(Consumer::getCity));
        System.out.println("4. Group customers by their city and return a Map<String, List<Customer>>."+groupedConsumer);
        // 5. Count how many orders each customer has placed.

    }
}
