class Solution {
    public int solution(String skill, String[] skill_trees) {
        int count = 0;

        for (String skillTree : skill_trees) {
            String filtered = skillTree.replaceAll("[^" + skill + "]", "");
            if (skill.startsWith(filtered)) {
                count++;
            }
        }

        return count;
    }
}