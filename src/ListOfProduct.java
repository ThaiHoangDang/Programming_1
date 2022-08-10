import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ListOfProduct {
    private ArrayList<Product> productList;
    public ListOfProduct() {
        productList = new ArrayList<Product>();
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }
    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }
    public void addProductToList(Product p) {
        productList.add(p);
    }

    public void constructProductsData() throws IOException {
        FileOutputStream of = new FileOutputStream("product.obj");
        ObjectOutputStream proOut = new ObjectOutputStream(of);

        Product p;

        p = new Product("iPhone 13 Pro Max 256GB", "Phone", "Apple's iPhone 13 features a ceramic shield front, Super Retina XDR display with True Tone and an A15 Bionic chip. The first design change users will notice is the smaller notch. After years of using the same-sized notch to house the Face ID components, Apple has finally reduced its size by 20%.", 30690000);
        addProductToList(p);
        p = new Product("Xiaomi Redmi Note 11", "Phone", "The Xiaomi Redmi Note 11 is one of 4 smartphones in the Xiaomi Redmi Note 11 range. It is positioned as a more accessible version of the Redmi Note 11 5G with a Qualcomm Snapdragon 680 4G SoC supported by 4 GB or 6 GB of RAM and 64 or 128 GB of storage, a 6.43-inch 90Hz AMOLED screen and a photo module versatile with a 50-megapixel main sensor. It also has a 5000 mAh battery compatible with 33W fast charging.", 3990000);
        addProductToList(p);
        p = new Product("iPhone 12 64GB", "Phone", "Beyond adding 5G, Apple has equipped the iPhone 12 family with its powerful new A14 Bionic processor, a Super Retina XDR display, a more durable Ceramic Shield front cover, and a MagSafe feature for more reliable wireless charging, and support for attachable accessories.", 25050000);
        addProductToList(p);
        p = new Product("Samsung Galaxy S22 Ultra", "Phone", "The Samsung Galaxy S22 Ultra is the headliner of the S22 series. It's the first S series phone to include Samsung's S Pen. Specifications are top-notch including 6.8-inch Dynamic AMOLED display with 120Hz refresh rate, Snapdragon 8 Gen 1 processor, 5000mAh battery, up to 12gigs of RAM, and 1TB of storage.", 25050000);
        addProductToList(p);
        p = new Product("Nokia X10 5G", "Phone", "Running your business demands energy, performance and innovation – everything you’ll find in Nokia X10. Superfast 5G and the full HD+ screen lets you power through your work. Meanwhile, the 48 MP quad camera with ZEISS Optics will capture all that’s important to you. Plus, the pro color-grading tools will help you present your ideas with real flair. You’ll also get the latest Android11, and up to 2-years of software upgrades and monthly security updates, so you can enjoy new features now and in the future", 4290000);
        addProductToList(p);
        p = new Product("Apple Macbook Air M2 2022 8GB 256GB ", "Laptop", "Apple MacBook Air M2 (2022) Specs. The base model has an eight-core CPU and eight-core GPU, 8GB of RAM, and 256GB of storage, while the $1,499 step-up model that I have been able to test comes with a 10-core GPU and 512GB of storage", 31490000);
        addProductToList(p);
        p = new Product("Macbook Pro 14 inch 2021", "Laptop", "The Apple MacBook Pro 2021 (14-inch) is an important laptop. And that's not only because of what it has but also for what it erases. The marquee features start with the M1 Pro chip, a seriously super-charged upgrade over the M1 chips that upped speeds and battery life last year.Then, there's the new Liquid Retina XDR displays, which offer improved contrast and refresh rates. Apple's also brought MagSafe charging — a safer way to refuel — back to the MacBook Pro.", 47690000);
        addProductToList(p);
        p = new Product("Laptop Asus Gaming Rog Strix G15 G513IH HN015W", "Laptop", "Featuring up to the latest 10th Gen Intel Core i7 CPU and a GeForce RTX2070 SUPER GPU, it offers high-FPS power that takes full advantage of up to a blazing fast 240Hz/3ms display. Intelligent cooling innovations like liquid metal take performance to another level.", 17990000);
        addProductToList(p);
        p = new Product("Laptop Huawei Matebook 14", "Laptop", "HUAWEI MateBook 14 is a laptop designed for the go. The precision craftsmanship shines through both the sleek, elegant appearance and the solid metal build5. Weighing just 1.49 kg,6 and 15.9 mm thin7, it's ideal for zipping off for the weekend or taking on that next business trip.", 18990000);
        addProductToList(p);
        p = new Product("Apple MacBook Pro 13 M1 256GB 2020", "Laptop", "It features over 20 billion transistors — 25 per cent more than M1 chip. And its 16‑core Neural Engine is capable of executing up to 15.8 trillion operations per second to accelerate machine learning tasks. Up to 24GB of high-performance unified memory gives the CPU and GPU shared access to a larger memory pool.", 28290000);
        addProductToList(p);
        p = new Product("iPad 10.2 2021 WiFi 64GB", "tablet", "Versatile. The new iPad has a beautiful 10.2-inch Retina display, powerful A13 Bionic chip, an Ultra Wide front camera with Center Stage, and works with Apple Pencil and the Smart Keyboard. iPad lets you do more, more easily. All for an incredible value.", 8490000);
        addProductToList(p);
        p = new Product("Apple iPad Pro 11 2021 M1 WiFi 128GB", "tablet", "The breakthrough M1 chip takes the industry-leading performance of iPad Pro to an entirely new level. The 8-core CPU design features the world's fastest CPU cores in low-power silicon — delivering up to 50 percent faster CPU performance than A12Z Bionic.", 19590000);
        addProductToList(p);
        p = new Product("Xiaomi Pad 5", "tablet", "Verdict. The Xiaomi Pad 5 is an exceptional Android tablet – but it is still an Android tablet. There's little to fault on the hardware front, where you'll find a lightweight design bolstered by strong specs, a gorgeous display, and great speakers.", 8990000);
        addProductToList(p);
        p = new Product("Samsung Galaxy Tab S7 Plus", "tablet", "Designed for work. Perfect for Play. Introducing the first ever 5G-enabled tablet in the US, the Galaxy S7+ and S71. The razor-sharp display, long-lasting battery2 and expandable memory3 are just the beginning. Add the redesigned S pen, which comes included, and the optional keyboard4 and you've got a tablet that lets you play harder and work smarter.", 14990000);
        addProductToList(p);
        p = new Product("iPad Air 10.9 2020 WiFi 64GBv", "tablet", "iPad Air features a 10.9-inch Liquid Retina display for an immersive visual experience, with 3.8 million pixels and advanced technologies, including 500 nits of brightness, full lamination, a P3 wide color gamut, True Tone, and an anti-reflective screen coating.", 13990000);
        addProductToList(p);
        p = new Product("Bluetooth Harman Kardon Onyx Studio 5", "Speaker", "Destined to be the best sounding, full featured portable Bluetooth speaker in its class, the Onyx Studio 5 offers up to 8 hours of playtime as well as wireless dual sound, which wirelessly connect two Harman Kardon Onyx Studio 5 speakers to elevate music listening experience.", 3490000);
        addProductToList(p);
        p = new Product("Bluetooth JBL Flip 5", "Speaker", "There's a button for Partyboost (a feature that allows you to connect to various other JBL speakers and have them all stream the same music), volume up, volume down, and play/pause.", 2190000);
        addProductToList(p);
        p = new Product("Bluetooth JBL Pulse 4", "Speaker", "Sound quality of the JBL Pulse 4 is excellent: The speaker provides a balanced profile that doesn't overemphasize bass like many other party speakers. There's plenty of bass to fill a small room but those who want more energy for playing loudly outdoors may want to look for a larger speaker.", 3490000);
        addProductToList(p);
        p = new Product("Bluetooth Marshall Acton 2", "Speaker", "There's no speakerphone, however, and this is not a portable speaker like many sub-$300 wireless models are. It delivers mostly solid audio performance, though at top volumes we experienced some distortion issues on deep bass tracks.", 6590000);
        addProductToList(p);
        p = new Product("Sony SRS-XB23 Extra Bass", "Speaker", "The Sony SRS-XB23 isn't bad for music. Its sound profile has a touch of extra boom in the bass range, and it can sound a bit veiled due to its recessed treble. That said, vocals and lead instruments are still reproduced pretty clearly and accurately.", 1790000);
        addProductToList(p);
        p = new Product("Bluetooth Apple AirPods 2", "Headphone", "Featured snippet from the web Powered by the Apple H1 headphone chip, AirPods deliver a faster and more stable wireless connection to your devices — up to 2x faster when switching between active devices, 2 and a 1.5x faster connection time for phone calls. The H1 chip also delivers up to 30 percent lower gaming latency.", 2790000);
        addProductToList(p);
        p = new Product("Apple AirPods Max", "Headphone", "AirPods Max combine high-fidelity audio with industry-leading Active Noise Cancellation to deliver an unparalleled listening experience. Each part of their custom-built driver works to produce sound with ultra-low distortion across the audible range.", 9390000);
        addProductToList(p);
        p = new Product("JBL Live Pro+", "Headphone", "JBL Live Pro+ TWS, Adaptive Noise Cancellation Earbuds with Mic, True Wireless Earbuds, up to 28 Hours Playtime, JBL Signature Sound, 6-Mic Technology for Crystal Clear Calls, Google Fast Pair", 2390000);
        addProductToList(p);
        p = new Product("JBL Tune 510BT", "Headphone", "The JBL Tune 510BT headphones let you stream powerful JBL Pure Bass sound with no strings attached. Easy to use, these headphones provide up to 40 hours of pure pleasure and an extra 2 hours of battery with just 5 minutes of power with the USB-C charging cable.", 1190000);
        addProductToList(p);
        p = new Product("Sony WH-1000XM4", "Headphone", "The Sony WH-1000XM4 headphones opt for a slightly thinner headband. The Sony WH-1000XM4 uses Bluetooth 5.0, has Bluetooth multipoint, and supports SBC, AAC, and Sony's own LDAC, which has the highest streaming quality possible if you're willing to deal with a somewhat less-stable connection.", 5990000);
        addProductToList(p);
        p = new Product("Webcam Rapoo C270L Full HD 1080P", "Accessory", "Rapoo C270L FHD 1080P Webcam - FHD 1080P, 30 FPS with H. 264 Video Encoding - 105 Degree Wide-Angle Lens - 3 Level Touch Control Beauty Exposure LED - 360 degree rotation - Double Noise Cancelling Omnidirectional Microphone - System Requirements: Windows 7/8/9/10 or above, MacOS X10.", 620000);
        addProductToList(p);
        p = new Product("laptop Macbook Wiwu Folding adjustable alunium S400", "Accessory", "Wiwu s400 folding adjustable aluminum durable laptop stand 6 heights of a laptop screen can be freely adjusted from 2.55” to 8” for a perfect eye level, letting you fix posture and reduce your neck fatigue, back pain, and eye strain. Very comfortable for working in home, office and outdoor.", 675000);
        addProductToList(p);
        p = new Product("USB Nano Bluetooth 5.0 TP-Link UB500", "Accessory", "It runs faster connection speeds and farther range than the Bluetooth 4.0 technology, ensuring a strong and stable wireless connection between your PC and Bluetooth devices.", 140000);
        addProductToList(p);
        p = new Product("Zhiyun Q3", "Accessory", "The Zhiyun-Tech Smooth-Q3 is a compact folding 3-axis stabilizer for smartphones, designed with a built-in LED video light with three selectable brightness levels. It provides stabilized motion along the pan, tilt, and roll axes to let you capture smooth, professional-looking video with your phone.", 1890000);
        addProductToList(p);
        p = new Product("Apple AirTag Loop", "Accessory", "Overview. Both lightweight and durable, the loop is made from polyurethane and securely fastens your AirTag to your items. The enclosure fits tightly around your AirTag to ensure that it stays put, so you can keep track of whatever it's attached to. AirTag is sold separately.", 395000);
        addProductToList(p);

        proOut.writeObject(productList);
    }

    public void readProducts() throws IOException, ClassNotFoundException {
        FileInputStream fi = new FileInputStream("product.obj");
        ObjectInputStream proIn = new ObjectInputStream(fi);

        productList = (ArrayList<Product>) proIn.readObject();

        for (Product p: productList) {
            System.out.println("ID: " + p.getId() + "\nName: " + p.getName() + " \n" + "Category: " + p.getCategory() + " \n" + "Detail: " + p.getDetail() + " \n" + "Price: " + p.getPrice() + "\n\n");
        }
    }

    public void addNewProduct() throws IOException, ClassNotFoundException {
        FileInputStream fi = new FileInputStream("product.obj");
        ObjectInputStream proIn = new ObjectInputStream(fi);
        productList = (ArrayList<Product>) proIn.readObject();
        int listSize = productList.size();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Name: ");
        String name = scanner.nextLine();
        System.out.println("Cate: ");
        String cate = scanner.nextLine();
        System.out.println("Detail: ");
        String detail = scanner.nextLine();
        System.out.println("Price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();

        Product p = new Product(name, cate, detail, price);
        p.setId("P" + (listSize + 1));
        productList.add(p);

        FileOutputStream of = new FileOutputStream("product.obj");
        ObjectOutputStream proOut = new ObjectOutputStream(of);

        proOut.writeObject(productList);
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ListOfProduct productList = new ListOfProduct();

        productList.addNewProduct();
        productList.readProducts();

    }
}