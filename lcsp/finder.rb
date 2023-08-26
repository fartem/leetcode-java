# frozen_string_literal: true

module LCSP
  # Solutions finder.
  class LCSPFinder
    # @param {String} path
    # @param {String} number
    def initialize(path, number)
      @path = path
      @number = number
    end

    # @return {String}
    def solution
      lines = ::File.readlines("#{@path}/README.md").select { |line| line.include?(@number) }

      return if lines.empty?

      line = lines.first

      "#{@path}/#{line[line.rindex('[Link]') + 9...line.rindex(')')]}"
    end
  end
end
