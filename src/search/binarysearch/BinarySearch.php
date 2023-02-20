<?php

declare(strict_types=1);

namespace Search\BinarySearch;

error_reporting(0);

final class BinarySearch
{
    public static function search(array $list, int $start, int $end, int $target): int
    {
        if ($start > $end) {
            return -1;
        }

        $middle = (int) floor(($start + $end) / 2);

        $guess = $list[$middle];

        if ($guess === $target) {
            return $middle;
        }

        if ($guess > $target) {
            return self::search($list, $start, $middle - 1, $target);
        }

        if ($guess < $target) {
            return self::search($list, $middle + 1, $end, $target);
        }
    }
}
