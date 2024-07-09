class TelevisionVolumePresetsClient {
    public static void main(String[] args) {
        Television tv1 = new Television();
        tv1.setVolume(24);
        System.out.println(tv1);

        Television tv2 = new Television();
        tv2.setVolume(VolumeLevel.LOUD);
        System.out.println(tv2);
    }

}