/**
 * AnimatedBanner
 * 
 * Shifts the given banner text one character left every 200 milliseconds.
 * Uses System.currentTimeMillis() for precise timing without Thread.sleep() jitter.
 * 
 * Example output in console (refreshed in place):
 *   "Hello world!" -> "ello world!H" -> "llo world!He" -> ...
 */
public class AnimatedBanner {

    /**
     * Starts the smooth left‑shifting animation.
     * 
     * @param bannerText the text to animate (must not be null; empty string is allowed)
     */
    public void startBanner(String bannerText) {
        if (bannerText == null) {
            bannerText = "";
        }
        if (bannerText.isEmpty()) {
            System.out.println("Banner text is empty – nothing to animate.");
            return;
        }

        String current = bannerText;
        long nextShiftTime = System.currentTimeMillis();

        System.out.print("\n🎬 Animated Banner – rotating left every 200ms (Press Ctrl+C to stop)\n\n");

        while (true) {
            // Display the current banner (overwrites previous line)
            System.out.print("\r" + current);
            System.out.flush();

            // Wait until exactly 200 ms have passed from the last shift
            nextShiftTime += 200;
            long sleepTime = nextShiftTime - System.currentTimeMillis();
            if (sleepTime > 0) {
                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.out.println("\nAnimation interrupted.");
                    return;
                }
            }

            // Perform one left rotation: move first character to the end
            if (current.length() > 1) {
                current = current.substring(1) + current.charAt(0);
            }
            // If length is 1, the banner never changes – we keep running but no visual difference.
        }
    }

    /**
     * Demonstration: accepts bannerText as a parameter and runs the animation.
     */
    public static void main(String[] args) {
        AnimatedBanner banner = new AnimatedBanner();

        // Example usage – you can change this string to any text
        String myText = "🌀 Shift left every 200ms → smooth rotation! 🌀";
        banner.startBanner(myText);
    }
}
