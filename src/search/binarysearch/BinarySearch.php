<?php

declare(strict_types=1);

namespace Search\BinarySearch;

final class BinarySearch
{
    public static function search(array $list, int $target): int
    {
        $bottom = 0;

        $top = count($list);

        while ($bottom < $top) {
            $middle = (int) floor(($bottom + $top) / 2);

            $guess = $list[$middle];

            if ($guess === $target) {
                return $middle;
            }

            if ($guess > $target) {
                $top = $middle - 1;
            } else {
                $bottom = $middle + 1;
            }
        }

        return -1;
    }
}
